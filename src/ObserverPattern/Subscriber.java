package ObserverPattern;

public class Subscriber implements Observer{
    private String name;
    
    
    @Override
    public void update(String message) {
        System.out.println(name + "Received Notification : "+ message);
    }


    public Subscriber(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    
}
