// NOTE: Observable is deprecated
// this book is a couple years old.. but the concepts still apply

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, Display{
    Observable observable;
    private DataObject dataObject;

    public CurrentConditionsDisplay(Observable o){
        observable = o;
        observable.addObserver(this);
    }
    
    // "Object arg" is an optional data argument
    public void update(Observable o, Object arg){
        if(o instanceof WeatherData){
            this.dataObject = ((WeatherData)o).getWeatherData();
            display();
        }
    }

    public void display(){
		// implement display
		System.out.println("Current Conditions:");
		System.out.println("Temperature: " + dataObject.temp);
		System.out.println("Humidity: " + dataObject.humidity);
		System.out.println("Pressure: " + dataObject.pressure);
	}
}