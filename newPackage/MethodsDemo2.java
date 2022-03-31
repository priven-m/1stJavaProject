package newPackage;

public class MethodsDemo2 {
	
	static void showDemoMethod() {
		//code to be executed
		System.out.println(" is the first name");
	}
	
	static void showDemoMethodOneString(String fName) {
		//code to be executed
		System.out.println(fName + " is the first name");
	}
	static void showDemoMethodAge(String fName, int iAge) {
		//code to be executed
		System.out.println(fName + " is the first name" + " and " + iAge + "is the the age");
	}
	
	static void showDemoMethodFriend(String fName, String fFriend) {
		//code to be executed
		System.out.println(fName + " is the first name" + " and " + fFriend + "is the the friend");
	}
	
	static int returnInt(int x) {
		System.out.println("this is the return method" + "and this is the return pram value for x " + x);
		return 6;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		showDemoMethodOneString("Priven");
		showDemoMethodOneString("Precious");
		showDemoMethodOneString("Lance");
		showDemoMethodOneString("Luan"); 
		showDemoMethodOneString("Antionette");
		showDemoMethodOneString("Diana");
		showDemoMethodOneString("Wessel");
		
		showDemoMethodFriend("Diana", "Wessel");
		showDemoMethodAge("Wessel", 20);
		System.out.println(returnInt(6));
	}

}
