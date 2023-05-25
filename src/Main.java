import Observable.WeatherObservable;
import Observer.PhoneObserver;
import Observer.TVObserver;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        WeatherObservable delhiWeatherObservable = new WeatherObservable();

        delhiWeatherObservable.setWeatherStats("It is sunny in Delhi");
        delhiWeatherObservable.notifyObservers(); // Here no observers are notified

        PhoneObserver phoneObserver = new PhoneObserver(delhiWeatherObservable);
        delhiWeatherObservable.add(phoneObserver);

        delhiWeatherObservable.setWeatherStats("It started raining in Delhi");
        delhiWeatherObservable.notifyObservers(); // Only Phone-Observer is notified

        TVObserver tvObserver = new TVObserver(delhiWeatherObservable);
        delhiWeatherObservable.add(tvObserver);

        delhiWeatherObservable.setWeatherStats("It is cloudy in Delhi");
        delhiWeatherObservable.notifyObservers(); // Phone and TV both are notified

        delhiWeatherObservable.setWeatherStats("It is windy in Delhi");
        delhiWeatherObservable.notifyObservers(); // Phone and TV both are notified

    }
}
