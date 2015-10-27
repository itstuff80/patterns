/**
 * 
 */
package patterns.strategy;

import patterns.strategy.behaviors.impl.Fly4Rotors;
import patterns.strategy.behaviors.impl.FlyTailRotor;
import patterns.strategy.drones.abstractclasses.Drone;
import patterns.strategy.drones.impl.FourRotorsDrone;
import patterns.strategy.drones.impl.TailRotorDrone;
import patterns.strategy.drones.impl.TransformerDrone;

/**
 * @author ejurado
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drone tailRotorDrone=new TailRotorDrone();
				
		tailRotorDrone.laserShoot();
		tailRotorDrone.initializeLaser();
		tailRotorDrone.turnLeft();
		tailRotorDrone.setFlight(new Fly4Rotors());
		tailRotorDrone.fly();
		tailRotorDrone.turnRight();
		tailRotorDrone.turnLeft();
		tailRotorDrone.reverse();
		tailRotorDrone.laserShoot();
		
		System.out.println("--------------------------------------------------------------------------");
		
		Drone fourRotorDrone=new FourRotorsDrone();
		
		fourRotorDrone.laserShoot();
		fourRotorDrone.initializeLaser();
		fourRotorDrone.turnLeft();
		fourRotorDrone.setFlight(new Fly4Rotors());
		fourRotorDrone.fly();
		fourRotorDrone.turnRight();
		fourRotorDrone.turnLeft();
		fourRotorDrone.reverse();
		fourRotorDrone.laserShoot();
		
		System.out.println("--------------------------------------------------------------------------");
		
		Drone transformerDrone=new TransformerDrone();
		
		transformerDrone.laserShoot();
		transformerDrone.initializeLaser();
		transformerDrone.turnLeft();
		transformerDrone.setFlight(new Fly4Rotors());
		transformerDrone.fly();
		transformerDrone.turnRight();
		transformerDrone.turnLeft();
		transformerDrone.reverse();
		transformerDrone.laserShoot();

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Transforming to a TailRotor");
		System.out.println("--------------------------------------------------------------------------");
		transformerDrone.setFlight(new FlyTailRotor());
		transformerDrone.turnLeft();
//		transformerDrone.setFlight(new Fly4Rotors());
		transformerDrone.fly();
		transformerDrone.turnRight();
		transformerDrone.turnLeft();
		transformerDrone.reverse();
		transformerDrone.laserShoot();
	}

}
