package patterns.strategy.behaviors.impl;

import patterns.strategy.behaviors.interfaces.LaserInterface;

public class NormalLaser implements LaserInterface {

	private boolean initLaser=false;
	private boolean loading=false;
	
	public void shoot() {
		// TODO Auto-generated method stub
		if(!initLaser){
			System.out.println("Laser needs to be initialized before shooting");
		}else if(loading){
			System.out.println("Wait... Loading");		
		}else{
			loading=true;
			System.out.println("Loading laser...");
			System.out.println("3...");
			System.out.println("2...");
			System.out.println("1...");
			System.out.println("Shooting...");
			System.out.println("Laser blast shoot.");
			loading=false;
		}
			
	}

	public void initializeLaser() {
		// TODO Auto-generated method stub
		System.out.println("Initializing laser...");
		System.out.println("3...");
		System.out.println("2...");
		System.out.println("1...");
		System.out.println("Laser ready");
		initLaser=true;
	}

}
