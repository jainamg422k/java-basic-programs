package javaSession2;

public class FahrenToCelsius {

	public static void main(String[] args) {
		  int miniTemp = 0;
		  int maxTemp = 100;
		   int steps = 20;
		   for (int currF= miniTemp;currF<=maxTemp;currF+=steps) {
			   int currCelsiusTemp = (int)((5.0/9)*(currF - 32));
			  System.out.println(currF + "  "+ currCelsiusTemp); 
		   }

	}

}
