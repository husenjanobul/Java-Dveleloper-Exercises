package com.company.controller;

import com.company.enums.Gender;
import com.company.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @RequestMapping("/list")
    public String mentor(Model model){

        Mentor mentor1 = new Mentor("Abdullah","Obul",42, Gender.MALE);
        Mentor mentor2 = new Mentor("Abdurahman","Obul",35, Gender.MALE);
        Mentor mentor3 = new Mentor("Nuramine","Ablimit",56, Gender.FEMALE);

        model.addAttribute("mentor1",mentor1);
        model.addAttribute("mentor2",mentor2);
        model.addAttribute("mentor3",mentor3);


        //or

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Abdullah","Obul",42, Gender.MALE));
        mentorList.add(new Mentor("Abdurahman","Obul",35, Gender.MALE));
        mentorList.add(new Mentor("Nuramine","Ablimit",56, Gender.FEMALE));

        model.addAttribute("mentors",mentorList);

        return "mentor/mentor-list";
    }

}
