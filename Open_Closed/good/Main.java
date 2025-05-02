package Open_Closed.good;


public class Main {
    public static void main(String[] args) {
        NotifierInterface emailNotifier = new EmailNotifier();
        NotifierActionService emailService = new NotifierActionService(emailNotifier);
        emailService.send("Hello via Email");

        NotifierInterface smsNotifier = new SmSNotifer();
        NotifierActionService smsService = new NotifierActionService(smsNotifier);
        smsService.send("Hello from Sms");
    }
}
