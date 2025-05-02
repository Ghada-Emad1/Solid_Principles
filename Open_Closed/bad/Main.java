package Open_Closed.bad;

public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification();
        notification.send("email", " Hello from Email");
        notification.send("sms", " Hello from sms");
    }
}
