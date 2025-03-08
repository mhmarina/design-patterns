import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList<Observer> observers;
	public DataObject dataObject;

	public WeatherData(){
		observers = new ArrayList<Observer>();
	}

	public void addObserver(Observer o){
		// append arrayList
		observers.add(o);
	}

	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}
	}

	public void notifyObservers(){
		for(int i = 0; i < observers.size(); i++){
			Observer observer = (Observer)observers.get(i);
			observer.Update(dataObject);
		}
	}

	public void measurementsChanged(){
		notifyObservers();
	}

	public void setMeasurements(DataObject d){
		dataObject = d;
		measurementsChanged();
	}
}
