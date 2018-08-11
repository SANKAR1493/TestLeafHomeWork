package JavaTutorial;

public class ArrayClass {

	public static void main(String[] args){
		int[] arr = {11,22,33,44,55,66};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		//other type declaration
		int[] arr1 = new int[5];
		arr1[0] = 12;
		arr1[1] = 13;
		arr1[2] = 14;
		arr1[3] = 15;
		arr1[4] = 16;

		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);

		// To find the length of an array
		 int[] arra = new int[5];
		 // 'length' is a function in Java which gives you the size of an array
		 System.out.println(arra.length);
		 
		   }
	
}

