package observer.jdk;

import observer.again.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by xuan on 8/28/17.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void display() {

    }

    //pull moxing
    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
