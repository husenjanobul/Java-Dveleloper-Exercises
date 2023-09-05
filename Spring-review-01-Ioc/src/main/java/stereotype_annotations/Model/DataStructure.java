package stereotype_annotations.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataStructure {

//    @Autowired
//    ExtraHours extraHours;

    ExtraHours extraHours;

    public DataStructure(ExtraHours extraHours) {
        this.extraHours = extraHours;
    }

    public void getTotalHours(){
        System.out.println("Total hours: " + (34 + extraHours.getHours()));
    }

}
