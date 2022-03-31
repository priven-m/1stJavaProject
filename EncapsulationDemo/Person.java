package EncapsulationDemo;

public class Person {
	
	//private = restricted access
	private String pName;
	
	//Getter
	public String getName() {
		return pName;
	}
	
	//Setter
	public void setName(String newName) {
		this.pName = newName;
	}

}
