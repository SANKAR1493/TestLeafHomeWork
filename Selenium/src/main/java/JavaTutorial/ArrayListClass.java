package JavaTutorial;

import java.util.ArrayList;
//import java.util.Iterator;


public class ArrayListClass {

	public static void main(String [] args){
		// Creation of ArrayList with String elements
		ArrayList <String> arrList = new ArrayList<String>();
		// We can use any data type
		//arrList.add("987654321");
		// Here i am passing next two values as "STM" just to show you that List allows duplicate values.. 
		// Set wont allow duplicate values.
		// Adding elements to the array list
		//arrList.add("STM");
		//arrList.add("STM");
		//arrList.add("99.99");
		/*  // To get all the values from the list
		System.out.println(arrList);
		    // To get a value whose index is 1
		System.out.println(arrList.get(1)); 

		int size = arrList.size();
		System.out.println(size);

		for(int i=0; i<size; i++){
			System.out.println("Value of Array List at the index "+i+" is "+arrList.get(i));
		}

		for(Object arrListItem : arrList){
			System.out.println("Value of Array List at the index "+arrList.indexOf(arrListItem)+" is "+arrListItem);
		}
		Iterator itr = arrList.iterator();
		while (itr.hasNext()) {
		Object nxt = itr.next();
		System.out.println("Values are "+nxt);
		}
		for(String arrListItem:arrList){
			System.out.println(arrListItem);
		} */
		arrList.add(0, "987654321");
		arrList.add(1, "STM");
		 System.out.println(arrList);
		//Remove elements from array list like this
		 arrList.remove("987654321");
		 System.out.println(arrList);
		 arrList.add(0, "987654321");
		 System.out.println(arrList);
		 arrList.remove(0);
		 System.out.println(arrList);
	}

}

