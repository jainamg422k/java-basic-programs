package javaSession2;

public class SwipeNum {


		public static String change(int a ,int b) {
		 int temp = a;
		  a = b;
		b = temp;
		System.out.println(a + " " + b);
		 return a + " "+  b;
		
	}

	public static void main(String[] args) {
	  int n1 = 3;
	  int n2 =4;
	  System.out.println(n1 + " " + n2);
	  int temp = n1;
	  n1= n2;
	  n2 = temp;
	  System.out.println("n1" + " " + n1 + " " +"n2"+ " " + n2);
      String ans = change (n1 , n2);
       System.err.println(ans);
	}
	}


