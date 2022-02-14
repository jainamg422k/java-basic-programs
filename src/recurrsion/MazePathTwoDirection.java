package recurrsion;
//Print all possible paths from top left to bottom right of a mXn matrix
//you can move only in two way either horizontalleft or verticaldown
// Print the H stands horizonatl move and V stands for Vertical move
public class MazePathTwoDirection {
	static int count ;     // global variable can be access from anywhere
    public static  void maze(int cr , int cc,int er, int ec,String paths) {
    	//2nd Observation-> i.e. -ve base case whenever cr or cc > er or ec then it is out of matrix no path possible
    	if(cc> ec || cr >er) {
    		return;
    	}
// 3rd observation-> +ve base case whenever cc and cr == ec and er the  we got our paths print that
    	if(cc == ec && cr == er){
    		count++;
    		System.out.println(paths);
    		return;
    	}
    	//1st observation-> we have to choice thier move H or V so two recursive calls
    	// horizontal right
    	maze(cr, cc+1, er, ec, paths+"H");  // when we take step horizontally we increase col and append H means Horizontal move "--> move"
    // vertical down
    	maze(cr+1, cc, er, ec, paths+"V");  // when we take step vertically we increase row and append V means vertical move "\|/ move"
                                                                                                                       

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 count = 0;    // before calling paths fun every time need to re initalize this variable otherwise it will print old value + new value
		 int n = 3; //no.of rows 
		int m = 3; // no. of cols
		int [][] matrix = new int[n][m]; // this is of no use
		int cr = 0;  //count row
		int cc = 0;  // count col
		int er = n-1; // last row or end row of matrix
		int ec = m-1; // lasr col or end col of matrix
		maze(cr,cc,er,ec," ");
		System.out.println("Total possible path is"+" "+count);
		/*
		//count = 0; if not make count  = 0 ; before calling same function then will print //12 total path instead of 6
		//maze(cr,cc,er,ec," ");
		//System.out.println(count); //output  will 12 but out  is 6 
        */
	}

}
