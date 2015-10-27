/**
 * 
 */
package patterns.strategy.drones.impl;

import patterns.strategy.behaviors.impl.Fly4Rotors;
import patterns.strategy.behaviors.impl.NormalLaser;
import patterns.strategy.drones.abstractclasses.Drone;

/**
 * @author ejurado
 *
 */
public class TransformerDrone extends Drone {

	/* (non-Javadoc)
	 * @see patterns.strategy.drones.abstractclasses.Drone#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is a Transformer Drone, can convert to a 4 Rotor or a Tail Rotor drone.");		
	}
	
	public TransformerDrone(){
		display();
		System.out.println("Default initialization with 4 rotors");
		flight=new Fly4Rotors();
		laser=new NormalLaser();
	}

}
