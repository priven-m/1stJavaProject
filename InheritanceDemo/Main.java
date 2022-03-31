package InheritanceDemo;

public class Main extends Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mustang myMustang = new Mustang();
		Ranger myRanger = new Ranger();
		Car myCar = new Car();
		
		System.out.println(myRanger.brand + " " + myRanger.modelName1);
		myRanger.driveType();
		myRanger.honk();
		
		System.out.println();
		
		System.out.println(myCar.brand + " " + myMustang.modelName);
		myMustang.driveType();
		myMustang.honk();
		
	}

}
