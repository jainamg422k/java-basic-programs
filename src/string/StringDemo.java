package string;

public class StringDemo {

	public static void main(String[] args) {
		String ambani = "kartik";
		String alok = new String("kartik");
		//String alok = "kartik";  
		System.out.println(ambani == alok); // == checks address(location) is same or not
		System.out.println(ambani.equals(alok));// check actual value
		
	   
	}

}
