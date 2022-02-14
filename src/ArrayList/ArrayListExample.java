package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
     ArrayList<Integer>list = new ArrayList<>();
     System.out.println(list.size());
     
     list.add(67);
     list.add(65);
     list.add(66);
     list.add(65);
     list.add(63);
     list.add(62);
     list.add(61);
     list.add(60);
     list.add(63);
     list.add(43);
     System.out.println(list.size());
     System.out.println(list);
     System.out.println(list.contains(456));
     list.set(0, 99);
     System.out.println(list);
     list.remove(2);
     System.out.println(list);
     
     for(int i = 0; i< 5; i++) {
    	 list.add(sc.nextInt());
     }
     for(int i = 0; i<5 ; i++) {
    	 System.out.println(list.get(i));
     }
     */
		ArrayList<Integer>name = new ArrayList<>();
		name.add(10);
		name.add(20);
		name.add(30);
		name.add(40);
		System.out.println(name);
		System.out.println(name.get(1));
		name.add(2, 70);
		System.out.println(name);
	    name.set(2, 25);
	    System.out.println(name);
	}

}
