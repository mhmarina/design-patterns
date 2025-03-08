public class CurrentConditionsDisplay implements Observer, Display{

	public DataObject myData;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject s){
		weatherData = s;
		s.addObserver(this);
	}

	// implement update from Observer interface
	public void Update(DataObject newData){
		myData = newData;
		display();
	}

	public void display(){
		// implement display
		System.out.println("Current Conditions:");
		System.out.println("Temperature: " + myData.temp);
		System.out.println("Humidity: " + myData.humidity);
		System.out.println("Pressure: " + myData.pressure);
	}
}
