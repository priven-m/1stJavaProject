package RevisedOop;

public class FavouriteCarRevised {
	
	static void myCarMethod() {
		System.out.println("Welcome to the car test:");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myCarMethod();
		System.out.println();
				
		//car make instance
		CarsRevised cm = new CarsRevised();
		cm.make = "Audi";
		cm.model = "Q5";
		cm.colour = "Blue";
		System.out.println("This is the car under test: " + cm.make + ", " + cm.model + ", " +  cm.colour);
		System.out.println();
		
		cm.CarDrives();
		
		cm.CarTurns();
		
		cm.CarBrakes();
	}

}
