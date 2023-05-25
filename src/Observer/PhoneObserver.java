package Observer;

import Observable.IObservable;
import Observable.WeatherObservable;

public class PhoneObserver implements IObserver {
    WeatherObservable weatherObservable;

    public PhoneObserver(WeatherObservable observable) {
        this.weatherObservable = observable;
    }

    @Override
    public void update() {
        System.out.println("Phone Observer is updated with new Weather Stats value :: " + this.weatherObservable.getWeatherStats());
    }
}
