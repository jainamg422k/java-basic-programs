package javaSession2;

public class ForEachLoop {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40};
		int el = 30;
		for(int a : arr) {
			System.out.println(a);{}
			if(a == el) {
				break;
			}
		}

	}

}
