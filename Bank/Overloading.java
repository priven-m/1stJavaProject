package Bank;

public class Overloading {
	public int cube(int x) {
		return x*x*x;
	}
	public double cube(double x) {
		return x*x*x;
	}
	public float cube(float x) {
		return x*x*x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading myMultiplication = new Overloading();
		System.out.println("The cube of 5 is " + myMultiplication.cube(5));
		System.out.println("the cube of 5.0 is " + myMultiplication.cube(5.0));
		System.out.println("The cube of 0.5 is " + myMultiplication.cube(0.5));
	}

}
