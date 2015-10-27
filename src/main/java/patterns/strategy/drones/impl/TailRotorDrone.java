/**
 * 
 */
package patterns.strategy.drones.impl;

import patterns.strategy.behaviors.impl.BigLaser;
import patterns.strategy.behaviors.impl.FlyTailRotor;
import patterns.strategy.behaviors.interfaces.FlyInterface;
import patterns.strategy.drones.abstractclasses.Drone;

/**
 * @author ejurado
 *
 */
public class TailRotorDrone extends Drone {

	/* (non-Javadoc)
	 * @see patterns.strategy.abstractclasses.Drone#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Three rotor drone with a tail rotor started.");
	}

	public TailRotorDrone() {
		flight=new FlyTailRotor();
		laser=new BigLaser();
		display();
	}
	
	@Override
	public void setFlight(FlyInterface flight) {
		// TODO Auto-generated method stub
		System.out.println("This Drone cannot be converted");
	}
	

}
