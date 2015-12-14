/**
 * 
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ejurado
 *
 */
public class Node {
	
	protected String name;
	protected String description;
	private ArrayList<Node> nodes=new ArrayList<Node>();

	public void add(Node node){
		nodes.add(node);
	}
	
	public void remove(Node node){
		nodes.remove(node);
	}

	public List<Node> getChilds(){
		return nodes;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void print(){
		System.out.println("\n" + getName());
		System.out.println(" " + getDescription());
		System.out.println("-------------------");
		for (Node node : nodes) {
			node.print();
		}
	}
}
