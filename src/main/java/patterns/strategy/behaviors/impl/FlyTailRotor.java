/**
 * 
 */
package patterns.strategy.behaviors.impl;

import patterns.strategy.behaviors.interfaces.FlyInterface;

/**
 * @author ejurado
 *
 */
public class FlyTailRotor implements FlyInterface {

	private boolean flying=false;
	/* (non-Javadoc)
	 * @see patterns.strategy.behaviors.interfaces.FlyInterface#fly()
	 */
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Starting left rotor...");
		System.out.println("Starting right rotor...");
		System.out.println("Starting tail rotor...");
		System.out.println("Levitating...");
		System.out.println("On flight");
		flying=true;
	}

	/* (non-Javadoc)
	 * @see patterns.strategy.behaviors.interfaces.FlyInterface#turnLeft()
	 */
	public void turnLeft() {
		// TODO Auto-generated method stub
		if (flying){
			System.out.println("Adjusting tail rotor for turn...");
			System.out.println("Turning left...");
			System.out.println("90 degrees left turn done");
		}else{
			System.out.println("Cannot turn if is not flying");
		}
	}

	/* (non-Javadoc)
	 * @see patterns.strategy.behaviors.interfaces.FlyInterface#turnRight()
	 */
	public void turnRight() {
		// TODO Auto-generated method stub
		if (flying){
			System.out.println("Adjusting tail rotor for turn...");
			System.out.println("Turning right...");
			System.out.println("90 degrees right turn done");
		}else{
			System.out.println("Cannot turn if is not flying");
		}
		
	}

	/* (non-Javadoc)
	 * @see patterns.strategy.behaviors.interfaces.FlyInterface#reverse()
	 */
	public void reverse() {
		// TODO Auto-generated method stub
		if(flying){
			System.out.println("Adjusting tail rotor for reverse...");
			System.out.println("Going in reverse");
		}else{
			System.out.println("Cannot go on reverse if is not flying");
		}
	}

}
