package oopRevised;

public class ReviseClass {
	int x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReviseClass rv = new ReviseClass();
		rv.x= 40;
		System.out.println(rv.x);
		
		//create another instance with a different value for x
		ReviseClass rv2 = new ReviseClass();
		rv2.x = 16;
		System.out.println(rv2.x);
		
	}

}
