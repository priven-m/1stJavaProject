package Constructor;

public class Main {
	//Create a class attribute
	int x;
	
	//create a class constructor for the Main class
	public Main() {
		//set the initial value for the class attribute x
		x = 5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a object if class Main (will call constructor)
		Main myObject = new Main();
		
		System.out.println(myObject);

	}

}
