package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig2 {

    @Bean(name = "WelcomeTo")
    public String welcome(){
        return "Welcome to my app";
    }

    @Bean
    public String  practice(){
        return "Spring core practice";
    }

    @Primary
    @Bean
    public String  test(){
        return "Primary test";
    }
    @Bean
    public String  test1(){
        return "Primary test1";
    }

}
