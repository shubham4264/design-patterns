public class Subscriber implements Observer{

    private String name;

    Subscriber(String name){
        this.name = name;
    }

    public void update(String videoName, String youtuberName){
        System.out.println("Alert sent to "+ name + " for this video - "+ videoName + " from "+ youtuberName);
    }
}
