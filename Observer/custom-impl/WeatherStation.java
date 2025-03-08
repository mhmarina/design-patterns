public class WeatherStation{
    public static void main(String[] args){
        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay cd = new CurrentConditionsDisplay(wd);
        wd.setMeasurements(new DataObject(1.0f, 2.0f, 3.0f));
        wd.setMeasurements(new DataObject(5.0f, 2.0f, 3.0f));
    }
}

// to run:
// javac @build -d WeatherStation
// cd WeatherStation 
// java WeatherStation