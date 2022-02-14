package javaSession2;
 import java.util.Scanner;
public class Calulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		
		while(true) {
			System.out.println("Enter Operator");
			char ch = sc.next().trim().charAt(0);
			if(ch== '+' || ch == '*'|| ch=='-') {
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				if(ch == '+') {
					ans = num1 + num2;
				}
				if(ch == '-') {
					ans = num1 - num2;
				}
				if(ch == '*') {
					ans = num1 * num2;
				}
			}
			else if(ch == 'X' || ch =='x') {
				break;
			}
			else {
			System.out.println("Invalid operator");	
			}
			System.out.println(ans);
		}
	}

}
