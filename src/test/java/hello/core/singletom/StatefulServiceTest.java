package hello.core.singletom;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Testconfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        //ThreadA : a사용자 10000원 주문
        statefulService1.order("userA", 10000);

        //ThreadB : b사용자 20000원 주문
        statefulService2.order("userB", 20000);

        //ThreadA : a사용자 주문금액조회
        int price = statefulService1.getPrice();
        System.out.println(price);

    }

    @Configuration
    static class Testconfig{

        @Bean
        public StatefulService statefulService(){
            return new StatefulService();
        }
    }
}
