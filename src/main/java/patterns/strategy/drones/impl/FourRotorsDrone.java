/**
 * 
 */
package patterns.strategy.drones.impl;

import patterns.strategy.behaviors.impl.Fly4Rotors;
import patterns.strategy.behaviors.impl.NormalLaser;
import patterns.strategy.behaviors.interfaces.FlyInterface;
import patterns.strategy.drones.abstractclasses.Drone;

/**
 * @author ejurado
 *
 */
public class FourRotorsDrone extends Drone {

	/* (non-Javadoc)
	 * @see patterns.strategy.abstractclasses.Drone#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Four rotors drone started.");
	}

	public FourRotorsDrone() {
		flight=new Fly4Rotors();
		laser=new NormalLaser();
		display();
	}
	
	@Override
	public void setFlight(FlyInterface flight) {
		// TODO Auto-generated method stub
		System.out.println("This Drone cannot be converted");
	}
}
