package Open_Closed.good;


public class NotifierActionService {
    private NotifierInterface notifier;

    public NotifierActionService(NotifierInterface notifier) {
        this.notifier = notifier;
    }

    public void send(String message) {
        notifier.send(message);
    }
}
