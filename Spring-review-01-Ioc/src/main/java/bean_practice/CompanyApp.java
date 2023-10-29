package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CompanyApp {

    public static void main(String[] args) {

        //create spring container
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class,AppConfig2.class);

        FullTimeEmployee ft = container.getBean(FullTimeEmployee.class);
        ft.createAccount();

        PartTimeEmployee pt = container.getBean("p1",PartTimeEmployee.class);
        pt.createAccount();

        PartTimeEmployee pt2 = container.getBean("p2",PartTimeEmployee.class);
        pt2.createAccount();

//        String welcome = container.getBean("welcome",String.class);
//        System.out.println(welcome);

        String primary = container.getBean(String.class);
        System.out.println(primary);

        String welcome2 = container.getBean("WelcomeTo",String.class);
        System.out.println(welcome2);

        String practice = container.getBean("practice",String.class);
        System.out.println(practice);

        String primary1 = container.getBean(String.class);
        System.out.println(primary1);


    }

}
