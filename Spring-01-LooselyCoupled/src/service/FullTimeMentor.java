package service;

import implementation.Mentor;

public class FullTimeMentor implements Mentor {
    @Override
    public void createMentor() {
        System.out.println("Full Time Mentor Account is created.");
    }
}
