package recurrsion;

public class BoardPath {
//dice as 6 digit so thier will be six choices to reach to destination
	public static void printPaths(String paths , int src , int des) {
   if(src> des) { // if src goes beyond the destination so that path is not possible 
	   return;
   }
    if(src == des) {
    
    	System.out.println("Path Possible to reach dest. is "+" "+paths);
    	return;
     }	
 // here we just increasing src how no. jump is taken
    printPaths(paths+'1', src+1, des);
    printPaths(paths+'2', src+2, des);
    printPaths(paths+'3', src+3, des);
    printPaths(paths+'4', src+4, des);
    printPaths(paths+'5', src+5, des);
    printPaths(paths+'6', src+6, des);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int src = 0;  // starting point
		int des = 10;       // ending point
		String paths = "";  // ading each jumps
		//int count  = 0;     // this is just to print path no.
		printPaths(paths,src,des);

	}

}
