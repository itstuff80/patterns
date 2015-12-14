/**
 * 
 */
package compositetest;

import org.junit.Test;

import composite.Node;

/**
 * @author ejurado
 *
 */
public class TestComposite {

	@Test
	public void testMenu(){
		Node products=new Node();
		Node airTime=new Node();
		Node billPayments=new Node();
		Node promotions=new Node();
		Node promotion1=new Node();
		
		Node company1=new Node();
		Node company2=new Node();
		
		Node electricity=new Node();
		Node phone=new Node();
		
		
		products.setName("Auto Payment");
		products.setDescription("Welcome to "+ products.getName() +", you can use the following options");
		
		airTime.setName("Air Time");
		airTime.setDescription("You can buy airTime for the following companies");
		
		company1.setName("Company 1");
		company1.setDescription("Get airtime for " + company1.getName());
		
		company2.setName("Company 2");
		company2.setDescription("Get airtime for " + company2.getName());
	
		billPayments.setName("Bill Payments");
		billPayments.setDescription("You can pay your services here.");
		
		electricity.setName("Electric company");
		electricity.setDescription("You can pay your electricity bill here");
		
		phone.setName("Phone company");
		phone.setDescription("You can pay your phone bill here");
		
		promotions.setName("Promotions");
		promotions.setDescription("Promotions we have right now");
		
		promotion1.setName("Promotion 1");
		promotion1.setDescription("You can get free airTime with your last ticket");
		
		promotion1.add(company1);
		promotion1.add(company2);
		
		promotions.add(promotion1);
		
		airTime.add(company1);
		airTime.add(company2);
			
		billPayments.add(electricity);
		billPayments.add(phone);
		
		products.add(airTime);
		products.add(billPayments);
		products.add(promotions);
		
		products.print();
		
	}
}
