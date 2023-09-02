import java.util.ArrayList;
import java.util.List;

public class Youtuber implements Observable{

    private String youtuberName;
    private String videoName;

    private List<Observer> subscribers;

    Youtuber(String youtuberName){
        this.youtuberName = youtuberName;
        this.subscribers = new ArrayList<>();
    }
    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String videoName) {
        for(Observer subscriber: subscribers){
            subscriber.update(videoName, youtuberName);
        }
    }

    public void uploadVideo(String videoName) {
        this.videoName = videoName;
        notifySubscribers(this.videoName);
    }
}
