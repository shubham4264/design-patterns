public class MainApplication {

    public static void main(String[] args){

        Youtuber youtuber = new Youtuber("redChillies");

        Observer observer = new Subscriber("Shubham");
        Observer observer1 = new Subscriber("Shivam");

        youtuber.subscribe(observer);
        youtuber.subscribe(observer1);

        youtuber.uploadVideo("Trailer");
        youtuber.uploadVideo("Song");

        Youtuber youtuber1 = new Youtuber("Elvish Yadav");

        youtuber1.subscribe(observer);
        youtuber1.uploadVideo("Daily vlog");
    }
}
