package newPackage;

public class methodElse {

	//it is common to use if .. else inside the method
	//Create checkAge() method with in variable
	
	static int checkAge(int num1, int num2) {
		return num1 + num2;
		//if the age is less than 18 print "access denied"
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int returnvalue = checkAge(10, 5);
		if(returnvalue < 18) {
			System.out.println("Access denied");
			}else 
			{
				System.out.println("Access granted!");
			}

	}

}
