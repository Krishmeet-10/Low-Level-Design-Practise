package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel eidtsChannel = new YoutubeChannel();

        Subscriber s1 = new Subscriber("Krishmeet");
        Subscriber s2 = new Subscriber("Chetan");
        Subscriber s3= new Subscriber("Heemank");

        eidtsChannel.subscribe(s1);
        eidtsChannel.subscribe(s2);

        eidtsChannel.uploadVideo("Naukuchiatal reel");

        eidtsChannel.unsubscribe(s2);
        eidtsChannel.subscribe(s3);

        eidtsChannel.uploadVideo("Hosteller Chakrata reel");
    }
}
