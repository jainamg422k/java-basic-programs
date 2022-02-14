package javaSession2;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int h2 = sc.nextInt();
		if(h1>h2) {
			System.out.println("h1 wins");
		}
		else if(h1== h2){
			System.out.println("draw");
			}
		else{
			System.out.println("h2 wins");
		}
		
	}

}
