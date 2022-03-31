package oopMethod;

public class RunThis {
	
	//it can be accessed without creating an object
	static void myMethod() {
		System.out.println("Hello world");
	}
	//must create an instance of the method
	public void myPublicMethod () {
		System.out.println("Public method called by creating object");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Call static method
		myMethod();
		
		RunThis rt = new RunThis();
		rt.myPublicMethod();
	}

}
