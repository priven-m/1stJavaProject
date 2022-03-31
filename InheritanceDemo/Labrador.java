package InheritanceDemo;

public class Labrador extends Dogs {
	int age = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Labrador myDog = new Labrador();
		myDog.Breed = "Pitbull";
		myDog.age = 7;
		
		
	    System.out.println("Dog details: " + myDog.age + " year old " + myDog.Breed);
	    System.out.println();
		
		System.out.println("Instruct dog to sit: ");
	    Sit();
	    
	    System.out.println();
		
		System.out.println("Instruct dog to go outside: ");
		Labrador dogInstruc = new Labrador();
		dogInstruc.goOut();
	}

}
