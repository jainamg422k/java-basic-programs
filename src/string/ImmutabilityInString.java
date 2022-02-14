package string;

public class ImmutabilityInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[]alokHouse = new int[5];
		int []sachwinHouse = alokHouse;
		alokHouse[0] =5;
		System.out.println(sachwinHouse[0]);
		*/
  //In java String are immutable
		String ambaniHouse ="antila";
		// here ambaniHouse and alokHouse pointing to same address in internpool memory
		String alokHouse = "antila";
		System.out.println(alokHouse); //antilia 
	//here now  new string is made in internpool
		//now ambaniHouse and alokHouse not pointing to same address
		alokHouse =  alokHouse + "a";
		//now contacation is done using new keyword so this will made in heap  not in intenpool
		System.out.println(alokHouse);  //antiliaa
		
		//SUBSTRING Method
		String str1 = "kartik";
		int n =  str1.length();
		System.out.println(str1.substring(1, 4));
		
	}

}

