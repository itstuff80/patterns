/**
 * 
 */
package patterns.observer.customimplementation;

import java.util.ArrayList;
import java.util.List;

import patterns.observer.interfaces.MyObservableInterface;
import patterns.observer.interfaces.ObserverInterface;

/**
 * @author ejurado
 *
 */
public class MyObservableObj implements MyObservableInterface {

	List<ObserverInterface> lstObservers;
	boolean hasChanged;
	String state;
	
	public MyObservableObj(){
		lstObservers=new ArrayList<ObserverInterface>();
		hasChanged=false;
	}
	
	protected void setChanged(){
		hasChanged=true;
	}
	
	/* (non-Javadoc)
	 * @see patterns.observer.customimplementation.MyObservableInterface#addObserver(patterns.observer.interfaces.ObserverInterface)
	 */
	public void addObserver(ObserverInterface o){
		lstObservers.add(o);
	}
	
	/* (non-Javadoc)
	 * @see patterns.observer.customimplementation.MyObservableInterface#removeObserver(patterns.observer.interfaces.ObserverInterface)
	 */
	public void removeObserver(ObserverInterface o){
		lstObservers.remove(o);
	}
	
	/* (non-Javadoc)
	 * @see patterns.observer.customimplementation.MyObservableInterface#notifyObservers()
	 */
	public void notifyObservers(){
		for (ObserverInterface observer : lstObservers) {
			observer.update(this);
		}
		hasChanged=false;
	}
	
	/* (non-Javadoc)
	 * @see patterns.observer.customimplementation.MyObservableInterface#setState(java.lang.String)
	 */
	public void setState(String newState){
		state=newState;
		setChanged();
		notifyObservers();
	}
	
	/* (non-Javadoc)
	 * @see patterns.observer.customimplementation.MyObservableInterface#getState()
	 */
	public String getState(){
		return state;
	}
	
}
