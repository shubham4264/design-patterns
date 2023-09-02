package notificationSystem;

public class MainApplication {

    public static void main(String[] args){

        StocksObservable iphoneStocksObservable = new IPhoneStocksObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserver("yahoo", iphoneStocksObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserver("98765", iphoneStocksObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("12345", iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setData(7);
    }
}
