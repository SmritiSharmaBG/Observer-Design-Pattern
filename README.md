# Observer Design Pattern

In this example, we have 
- Observable - WeatherObservable
- Observer - PhoneObserver and TVObservable

WeatherObservable has some state which changes frequently. PhoneObserver and TVObservable are interested in updating themselves whenever WeatherObservable changes its state.

So, here we use Observer Design Pattern for this implementation

### Learnings for me : 
- Interface can not be instantiated but can be declared.
