package hello.core;


import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core",
        // AppConfig 예제 보존하기 위해 충돌 막기 위해
        excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

    // 컴포넌트 스캔 - 빈을 쫘악 땡겨
    @Bean(name = "memoryMemberRepository")
    MemberRepository memberRepository()
    {
        return new MemoryMemberRepository();
    }

}
