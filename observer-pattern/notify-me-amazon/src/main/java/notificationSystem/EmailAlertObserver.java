package notificationSystem;

public class EmailAlertObserver implements NotificationAlertObserver{

    String emailId;
    StocksObservable observable;

    public EmailAlertObserver(String emailId, StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }
    public void update(String productName){
        System.out.println("Email sent to "+ emailId + " for this product -" + productName);
    }
}
