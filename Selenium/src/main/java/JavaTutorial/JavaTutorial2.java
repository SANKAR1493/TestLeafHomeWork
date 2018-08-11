package JavaTutorial;

public class JavaTutorial2 {

	static int staticVar = 100; // static variable
	 int instanceVar = 200; // instance variable
	public static void main(String[] args) {
	
		int localVar = 300; // local variable
		 
		 // We can access static variables without creating an Object of a class
		 System.out.println("Value of a Static Variable is "+staticVar);
		 // Creating an instance of a class 'JavaTutorial2' 
		 JavaTutorial2 var = new JavaTutorial2();
		 System.out.println("Value of a Instance Variable is "+var.instanceVar);
		 System.out.println("Value of a Local Variable is "+localVar);
	}

}
