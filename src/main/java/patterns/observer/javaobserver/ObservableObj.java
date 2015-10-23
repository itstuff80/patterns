/**
 * 
 */
package patterns.observer.javaobserver;

import java.util.Observable;

/**
 * @author ejurado
 *
 */
public class ObservableObj extends Observable{

	String state;
	
	public void setState(String newState){
		state=newState;
		setChanged();
		notifyObservers();
	}
	
	public String getState(){
		return state;
	}
	
}
