package newPackage;

public class MethodsDemo3 {
	
	static int methodNameSurAge(String fName, String lName, int iAge) {
		//code to be executed
		System.out.println("Hi, Your name is " + fName + " "+ lName + " and your age is " + iAge);
		return 2 * 100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int returnValue = methodNameSurAge("Priven", "Mnisi", 2);
		System.out.println(returnValue);
	}

}
