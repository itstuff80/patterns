package patterns.observer.interfaces;


public interface MyObservableInterface {

	public abstract void addObserver(ObserverInterface o);

	public abstract void removeObserver(ObserverInterface o);

	public abstract void notifyObservers();

	public abstract void setState(String newState);

	public abstract String getState();

}