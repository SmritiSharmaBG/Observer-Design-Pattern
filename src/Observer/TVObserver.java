package Observer;

import Observable.WeatherObservable;

public class TVObserver implements IObserver {
    WeatherObservable weatherObservable;

    public TVObserver(WeatherObservable weatherObservable) {
        this.weatherObservable = weatherObservable;
    }

    @Override
    public void update() {
        System.out.println("TV Observer is updated with new Weather Stats value :: " + this.weatherObservable.getWeatherStats());
    }
}
