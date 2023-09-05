package stereotype_annotations.Model;


import org.springframework.stereotype.Component;

@Component
public class MicroServices {

    public void getTotalHours(){
        System.out.println("Total hours: " + 30);
    }
}
