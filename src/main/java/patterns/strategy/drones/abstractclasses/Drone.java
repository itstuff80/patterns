/**
 * 
 */
package patterns.strategy.drones.abstractclasses;

import patterns.strategy.behaviors.interfaces.FlyInterface;
import patterns.strategy.behaviors.interfaces.LaserInterface;

/**
 * @author ejurado
 *
 */
public abstract class Drone {

	protected FlyInterface flight;
	protected LaserInterface laser;
	
	public void fly(){
		flight.fly();
	}
	
	public void laserShoot(){
		laser.shoot();
	}
	
	public void turnLeft(){
		flight.turnLeft();
	}
	
	public void turnRight(){
		flight.turnRight();
	}
	
	public void reverse(){
		flight.reverse();
	}
	
	public void initializeLaser(){
		laser.initializeLaser();
	}
	
	public abstract void display();

	public FlyInterface getFlight() {
		return flight;
	}

	public void setFlight(FlyInterface flight) {
		this.flight = flight;
	}
	
}
