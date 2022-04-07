# spring-core-basic
스프링 기초 의존성 주입에 관하여

## 제어의 역전 IoC (프레임워크 - 제어권이 나에게 없다.)
프레임워크가 내 코드를 대신 호출하게 되어 제어권이 뒤바뀌었단 뜻.

AppConfig가 제어의 역전을 함.
OrderServiceImpl 은 그저 자신이 할일 createOrder만 실행을 함.

## BeanFactory
1. 스프링 컨테이너의 최상위 인터페이스
2. 스프링 빈을 관리하고 조회하는 역할 담당
3. ```getBean()```을 제공한다.
4. ```BeanFactory``` -> ```ApplicationContext``` -> ```AnnotationConfig ApplicationContext```

## 싱글톤
```@Configuration```을 통해 빈등록을 하게 되면 무리하게 객체 생성을 안 할 수 있다.
