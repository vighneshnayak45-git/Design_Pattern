import java.util.ArrayList;
import java.util.List;

public class Request {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o)
    {
        observers.add(o);
    }

    public void notifyObserver(String message)
    {
        for(Observer ob : observers)
        {
            ob.update(message);
        }
    }
}
