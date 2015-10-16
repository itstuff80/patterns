/**
 * 
 */
package patterns.observer.customimplementation;

import patterns.observer.interfaces.ObserverInterface;
import patterns.observer.javaobserver.ObservableObj;

/**
 * @author ejurado
 *
 */
public class AnotherCustomObserver implements ObserverInterface {

	private MyObservableObj ob;	

	public void update(MyObservableObj ob) {
		// TODO Auto-generated method stub
		this.ob=ob;
		System.out.println("Change in another observer: " + this.ob.getState());
	}

}
