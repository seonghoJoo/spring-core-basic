package hello.core.singletom;

public class SingletonService {

    // 스태틱영역에 객체 instance를 미리 하나 생성해서 올린다.
    private static final SingletonService instance = new SingletonService();


    // 메서드를 통해서만 조회할 수 있다.
    public static SingletonService getInstance(){
        return instance;
    }

    // 생성자를 privcate으로 하여 혹시라도
    // 외부에서 new 키워드로 객체 인스턴스가 생성되는것을 막는다
    private SingletonService(){

    }
    
    public void logic(){
        System.out.println("싱글톤 logic() 호출");
    }


}
