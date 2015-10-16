package patterns.observer.javaobserver;

import java.util.Observable;
import java.util.Observer;

public class ObserverObj implements Observer {
	
	String observerName;
	
	public ObserverObj(String observerName) {
		super();
		this.observerName = observerName;
	}

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("New State in " + observerName + ": " + ((ObservableObj)o).getState());
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

}
