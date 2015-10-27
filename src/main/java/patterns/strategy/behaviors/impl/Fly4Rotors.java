package patterns.strategy.behaviors.impl;

import patterns.strategy.behaviors.interfaces.FlyInterface;

public class Fly4Rotors implements FlyInterface {
	private boolean flying=false;
	/* (non-Javadoc)
	 * @see patterns.strategy.behaviors.interfaces.FlyInterface#fly()
	 */
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Starting left front rotor...");
		System.out.println("Starting right front rotor...");
		System.out.println("Starting left back rotor...");
		System.out.println("Starting right back rotor...");
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
			System.out.println("Adjusting right rotors for turn...");
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
			System.out.println("Adjusting left rotors for turn...");
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
			System.out.println("Cannot go on reverse, turning 180 degrees instead...");
			turnLeft();
			turnLeft();
			System.out.println("Going backwards");
		}else{
			System.out.println("Cannot go on reverse if is not flying");
		}
	}

}
