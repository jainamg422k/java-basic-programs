package recurrsion;

public class MazePath4Direction {
    public static void  printPaths(int cr,int cc,int row,int col,String out,boolean [][] visted){
    	
   
    	
    	if(cr>row|| cc>col||cr<0||cc<0||visted[cr][cc]== true) {
    		return;
    	}
    	if(cr == row && cc ==col) {
    		System.out.println(out);
    		return;
    	}
    	visted[cr][cc]= true;
    	printPaths(cr-1, cc, row, col,out+"U ",visted);
    	printPaths(cr+1, cc, row, col,out+"D ",visted);   //vertical Down
    	printPaths(cr,cc-1,row,col,out+"L ",visted); 
    	printPaths(cr, cc+1, row, col,out+"R " ,visted);  //horizontal Right
    visted[cr][cc]=false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
     
		printPaths(0 ,0, 2 , 2 ," ",new boolean[3][3]);
	}

}
