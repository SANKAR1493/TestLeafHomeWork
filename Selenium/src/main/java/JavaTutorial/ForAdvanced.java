package JavaTutorial;

public class ForAdvanced {

	public static void main(String[] args) {
		 int[] arr = {11,22,33,44,55};
		 
		 /*for(int i=0; i<arr.length; i++){
		 System.out.println(arr[i]);
		 }*/
		 for (int i : arr) {
			System.out.println(i);
		}
	}
	
}
