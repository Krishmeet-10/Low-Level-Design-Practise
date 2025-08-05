package ObserverPattern;

public interface Channel { //observable
    public void subscribe(Observer o);
    public void unsubscribe(Observer o);
    void notiftSubscirbers(String videoTitle);
}
