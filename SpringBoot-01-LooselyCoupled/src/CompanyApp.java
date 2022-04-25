import service.MentorAccount;
import service.PartTimeMentor;

public class CompanyApp {
    public static void main(String[] args) {
//        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        PartTimeMentor partTimeMentor = new PartTimeMentor();

//        MentorAccount mentorAccount = new MentorAccount(fullTimeMentor);
        MentorAccount mentorAccount = new MentorAccount(partTimeMentor);
        mentorAccount.manageAccount();
    }
}
