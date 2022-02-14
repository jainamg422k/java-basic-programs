package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListResizing {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>();
    System.out.println(arr.size());
    for(int i = 1; i<=15; i++) {
    	arr.add(i);
    	
    }
    System.out.println(arr);
	//taking input from user
    ArrayList<Integer> ghar = new ArrayList<>(20);//20 room ka ghar
    for(int i =1; i<=10; i++) {
    	int element = sc.nextInt();
    	ghar.add(element);
    }
    System.out.println(ghar);
    
	}

}
