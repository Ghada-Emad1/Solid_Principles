package Open_Closed.good;



public class SmSNotifer implements NotifierInterface {
    @Override
    public void send(String message) {
        System.out.println("Sending Sms" + message);
    }
}
