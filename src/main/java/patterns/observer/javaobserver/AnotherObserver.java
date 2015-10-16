/**
 * 
 */
package patterns.observer.javaobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @author ejurado
 *
 */
public class AnotherObserver implements Observer {

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Change in another observer: " + ((ObservableObj)o).getState());
	}

}
