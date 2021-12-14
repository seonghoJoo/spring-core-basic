package hello.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient {

    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출 url = " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // 서비스 시작시 호출
    public void connect() {
        System.out.println("connect : " + url);
    }

    public void call(String message) {
        System.out.println("call : " + url + " message : " + message);
    }

    // 서비스 종료시 호출
    public void disconnect() {
        System.out.println("close : " + url);
    }

    // InitializingBean 구현
    // 프로퍼티 셋팅 후 -> 의존관계 주입 후에 호출하겠다.
    @PostConstruct
    public void init() throws Exception {
        System.out.println("afterPropertioesSet");
        connect();
        call("초기화 연결 메세지");
    }

    // DisposableBean 구현
    // 종료될때 호출
    @PreDestroy
    public void close() throws Exception {
        System.out.println("destroy");
    }
}
