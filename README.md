# Observer Design Pattern

### Scenario : 
We have 2 devices Phone(PhoneObserver) and TV(TVObservable) which need to be up-to-date with the current weather. They are dependent on this weather-app(WeatherObservable) for this.

In this example, we have 
- Observable - WeatherObservable
- Observer - PhoneObserver and TVObservable

WeatherObservable has some state which changes frequently. PhoneObserver and TVObservable are interested in updating themselves whenever WeatherObservable changes its state.

So, here we use Observer Design Pattern for this implementation

### Learnings for me : 
- Interface can not be instantiated but can be declared.
