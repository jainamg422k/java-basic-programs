package javaSession2;

public class ArrayFunctionChanges {

	
	public static void sachwinrevenge  (char shubham[]) {
		for (int i = 0; i<shubham.length;i++) {
			shubham[i]= 'b';
		}
		
	}
	public static void main(String[] args) {
	   char shubham [] = {'w','w','w'};
	   for (int index = 0; index < shubham.length;index++)
	   System.out.print(shubham[index]); 
	   System.err.println();
	   sachwinrevenge(shubham);
	   for (int index = 0; index < shubham.length;index++)
		   System.out.print(shubham[index]);

	}

}
