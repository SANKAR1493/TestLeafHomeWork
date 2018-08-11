package JavaTutorial;

public class MyInterfaceClass implements MyInterfaceTwo {
	
	public static void main(String [] args){
		MyInterfaceTwo obj = new MyInterfaceClass();
		 obj.myMethodTwo();
		 obj.myMethodOne();
		 }
	// Try to comment the below method myMethodOne and see. You will face a compilation error. 
	 // As per the rule, this class must implement the abstract method of interface

	public void myMethodOne() {
		System.out.println("Implementation of myMethodOne");
		
	}

	public void myMethodTwo() {
		
		 System.out.println("Implementation of myMethodTwo");
		 
	}
	 
	 
	
	
}
