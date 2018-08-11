package JavaTutorial;

public class MethodOverridingChildClass extends RunTimePolymorphism {


	public void myMethod(){
		System.out.println("I am a method from Child Class");
	}

	public static void main(String [] args){
		MethodOverridingChildClass obj2 = new MethodOverridingChildClass();
		obj2.myMethod();


		RunTimePolymorphism obj = new MethodOverridingChildClass();
		// It calls the child class method myMethod()
		obj.myMethod();

		RunTimePolymorphism obj1 = new RunTimePolymorphism();
		obj1.myMethod();

	}
}
