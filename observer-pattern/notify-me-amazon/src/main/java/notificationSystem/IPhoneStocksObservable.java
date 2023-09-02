package notificationSystem;

import java.util.ArrayList;
import java.util.List;

public class IPhoneStocksObservable implements StocksObservable{

    String productName="Iphone";
    List<NotificationAlertObserver> observers = new ArrayList<>();
    int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void setData(int newStockAdded) {
        if(this.stockCount == 0) notifyObservers();
        this.stockCount += newStockAdded;
    }

    @Override
    public int getData() {
        return this.stockCount;
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver observer: observers){
            observer.update(productName);
        }
    }
}
