package Open_Closed.good;


public class EmailNotifier implements NotifierInterface{
    @Override
    public void send(String message){
        System.out.println("Sending Email :"+message);
    }
}
