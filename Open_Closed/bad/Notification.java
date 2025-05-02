package Open_Closed.bad;

public class Notification {
    public void send(String type,String message) {
        if (type.equals("email")){
            System.out.println("Sending Email"+message);
        }else if(type.equals("sms")){
            System.out.println("Sending Sms" + message);
        }else if(type.equals("push")){
            System.out.println("push"+message);;
        }
    }
}
// here we put all features in the same class 
// what if we need to add more features , we need to modifiy the code each time
// but with open/ closed priniples -> we need to open for extension and close for modifica