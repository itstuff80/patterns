/**
 * 
 */
package patterns.observer.javaobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import patterns.observer.interfaces.ObserverInterface;

/**
 * @author ejurado
 *
 */
public class ObservableObj extends Observable{

	List<Observer> lstObservers;
	boolean hasChanged;
	String state;
	
	public ObservableObj(){
		lstObservers=new ArrayList<Observer>();
		hasChanged=false;
	}
	
	protected void setChanged(){
		hasChanged=true;
	}
	
	public void addObserver(Observer o){
		lstObservers.add(o);
	}
	
	public void notifyObservers(){
		for (Observer observer : lstObservers) {
			observer.update(this, null);
		}
		hasChanged=false;
	}
	
	public void setState(String newState){
		state=newState;
		setChanged();
		notifyObservers();
	}
	
	public String getState(){
		return state;
	}
	
}
