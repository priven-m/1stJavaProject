package Constructor;

public class ConstructorParameters2 {
	int modelYear;
	String modelName;
	
	public ConstructorParameters2(int year, String name) {
		modelYear = year;
		modelName = name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorParameters2 myobject = new ConstructorParameters2(2021, "BMW");
		System.out.println(myobject.modelYear + " " + myobject.modelName);
	}

}
