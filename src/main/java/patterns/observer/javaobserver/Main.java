package patterns.observer.javaobserver;


public class Main {

	public static void main(String args[]) {
		ObservableObj obj=new ObservableObj();
		ObserverObj observer1=new ObserverObj("First observer");
		ObserverObj observer2=new ObserverObj("Second observer");
		AnotherObserver observer3=new AnotherObserver();
		
		obj.addObserver(observer1);
		obj.addObserver(observer2);
		obj.addObserver(observer3);
		
		obj.setState("first change");
		obj.setState("second change");
		
		
	}
}
