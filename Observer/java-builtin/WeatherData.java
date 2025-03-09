import java.util.Observer;
import java.util.Observable;

// observable is a class, NOT an interface
// this means that a child class that already inherits from another parent class
// cannot also inherit Observable. As opposed to being able to implement multipl interfaces.
public class WeatherData extends Observable{
    private DataObject dataObject;

    // we will be implementing a "PULL" observer-observable model
    // meaning that the subject does not need to keep track of the observers to PUSH data to them
    // instead, the observers will PULL from the subject themselves

    public WeatherData(){
        //
    }
    
    public void measurementsChanged(){
        setChanged(); // from Observable, sets "changed" to true
                      // this flag is checked when updating data in observers.
        notifyObservers();
    }

    public void setMeasurements(DataObject d){
        dataObject = d;
        measurementsChanged();
    }

    // Observer will use this to get data from Subject:
    public DataObject getWeatherData(){
        return this.dataObject;
    }
}