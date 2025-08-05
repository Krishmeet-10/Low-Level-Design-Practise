package ObserverPattern;

import java.util.LinkedList;
import java.util.List;

public class YoutubeChannel implements Channel{
    private List<Observer> list = new LinkedList<>();

    @Override
    public void subscribe(Observer o) {
        list.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        list.remove(o);
    }

    @Override
    public void notiftSubscirbers(String videoTitle) {
        for(Observer obj : list){
            obj.update("NEW Video Uploaded : " + videoTitle);
        }
    }

    public void uploadVideo(String title){
        System.out.println("uploaded video : "+title);
        notiftSubscirbers(title);
    }
    
}
