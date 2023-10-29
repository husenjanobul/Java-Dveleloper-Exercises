package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FullTimeEmployee fullTimeEmployee(){
        return new FullTimeEmployee();
    }

    @Bean(name = "p1")
    public PartTimeEmployee partTimeEmployee(){
        return new PartTimeEmployee();
    }
    @Bean(name = "p2")
    public PartTimeEmployee partTimeEmployee2(){
        return new PartTimeEmployee();
    }

}
