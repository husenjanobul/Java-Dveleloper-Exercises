package service;

import implementation.Mentor;

public class PartTimeMentor implements Mentor {
    @Override
    public void createMentor() {
        System.out.println("Part Time Account is created.");
    }
}
