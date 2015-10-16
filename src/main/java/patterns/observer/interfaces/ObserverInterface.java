/**
 * 
 */
package patterns.observer.interfaces;

import patterns.observer.customimplementation.MyObservableObj;

/**
 * @author ejurado
 *
 */
public interface ObserverInterface {

	public void update(MyObservableObj ob);
}
