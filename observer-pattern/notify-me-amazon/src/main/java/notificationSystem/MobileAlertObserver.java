package notificationSystem;

public class MobileAlertObserver implements NotificationAlertObserver{

    String mobileNumber;
    StocksObservable observable;

    MobileAlertObserver(String mobileNumber, StocksObservable observable){
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }
    @Override
    public void update(String productName) {
        System.out.println("Mobile Alert sent to "+ mobileNumber+ " for this product - "+ productName);
    }
}
