package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	  ArrayList<Integer> arr=  new ArrayList< >();
	  System.out.println(arr.size());
	//insert an element in list(num elements will increase)
	    arr.add(40);
	    arr.add(10); 
	    arr.add(20);
	    arr.add(30);
	   System.out.println( arr.size());
	   System.out.println("arr is ");
	    System.out.println(arr);
	  //get the value at a particular index
	     System.out.println(arr.get(1));
	     System.out.println(arr.get(3));
	   //set - update
	    arr.set(2,60);
	    System.out.println(arr);
	//remove
	    arr.remove(2);
	    System.out.println(arr);
	    int lI = arr.size() -1;
	    System.out.println(lI);
	  
	}

}
