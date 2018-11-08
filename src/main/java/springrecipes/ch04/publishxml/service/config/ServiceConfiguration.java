package springrecipes.ch04.publishxml.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springrecipes.ch04.publishxml.service.InMemoryMemberService;
import springrecipes.ch04.publishxml.service.MemberService;

@Configuration
public class ServiceConfiguration {
    @Bean
    public MemberService memberService() {
        return new InMemoryMemberService();
    }
}
