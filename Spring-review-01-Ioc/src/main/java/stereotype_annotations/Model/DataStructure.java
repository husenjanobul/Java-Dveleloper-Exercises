package stereotype_annotations.Model;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataStructure {

//    @Autowired
//    ExtraHours extraHours;

    ExtraHours extraHours;

//    public DataStructure(ExtraHours extraHours) {
//        this.extraHours = extraHours;
//    }

    public void getTotalHours(){
        System.out.println("Total hours: " + (34 + extraHours.getHours()));
    }

}
