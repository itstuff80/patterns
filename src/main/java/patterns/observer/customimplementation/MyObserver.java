package patterns.observer.customimplementation;

import patterns.observer.interfaces.ObserverInterface;

public class MyObserver implements ObserverInterface {

	private String name;
	private MyObservableObj ob;	
	
	public MyObserver(String name) {
		super();
		this.name = name;
	}
	
	public void update(MyObservableObj ob) {
		this.ob=ob;
		System.out.println("New State in " + name + ": " + this.ob.getState());	
	}

}
