package Constructor;

public class ConstructorParameters {
	int x;
	String constructorName;
	
	public ConstructorParameters(int y, String myName) {
		x = y;
		constructorName = myName;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorParameters myobject = new ConstructorParameters(6, "Priven");
		System.out.println(myobject.x + " " + myobject.constructorName);
	}

}
