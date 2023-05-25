package Observable;

import Observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherObservable implements IObservable {
    List<IObserver> observerList = new ArrayList<>();
    private String weatherStats;

    @Override
    public void add(IObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : this.observerList) {
            observer.update();
        }
    }

    public void setWeatherStats(String weatherStats) {
        this.weatherStats = weatherStats;
    }

    public String getWeatherStats() {
        return this.weatherStats;
    }
}
