package patterns.observer.customimplementation;

import patterns.observer.interfaces.MyObservableInterface;
import patterns.observer.interfaces.ObserverInterface;

public class CustomObserverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyObservableInterface obj=new MyObservableObj();
		ObserverInterface observer1=new MyObserver("First observer");
		ObserverInterface observer2=new MyObserver("Second observer");
		ObserverInterface observer3=new AnotherCustomObserver();
		
		obj.addObserver(observer1);
		obj.addObserver(observer2);
		obj.addObserver(observer3);
		
		obj.setState("first change");
		obj.setState("second change");
	}

}
