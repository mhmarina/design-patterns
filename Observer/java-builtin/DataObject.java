public class DataObject{
	public float temp;
	public float humidity;
	public float pressure;
	
	// constructor
	// we want to encapsulate the data into this class
	// so that we can easily add to it later on 
	// without having to change method signatures in observer/observable.
	public DataObject(float t, float h, float p){
		temp = t;
		humidity = h;
		pressure = p;
	}
}
