package stereotype_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotations.Config.AppConfig;
import stereotype_annotations.Model.DataStructure;
import stereotype_annotations.Model.MicroServices;

public class CompanyApp {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        DataStructure dataStructure = container.getBean(DataStructure.class);
        dataStructure.getTotalHours();

        MicroServices microServices = container.getBean(MicroServices.class);
        microServices.getTotalHours();

    }
}
