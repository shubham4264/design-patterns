package notificationSystem;

public interface StocksObservable {

    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

   void notifyObservers();

    void setData(int newStockAdded);

    int getData();
}
