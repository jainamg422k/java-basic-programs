package javaSession2;

import java.util.Scanner;

import recurrsion.power;
public class Main{
	public static int first(int[]arr ,int ci,int n, int search,int index) {
		int count =0;
		 if(ci  == n) {
			 return index;
		 }
		 // my work
		if(arr[ci] == search) {
			  index = ci;
		}
		int recAns = first(arr , ci+1, n, search,index);
		 return recAns;
	}
	public static void main(String[] args) {
	  
	int []arr = {3,4,5,6,5,7};
	int search = 10;
	int index = -1;
	//int ci = arr.length -1;
	  int ans = first(arr, 0,arr.length,search, index); 
	  System.out.println(ans);
	  
		
	}
}		 










  
       
     
	

		
	
   
	

    
	

	
		
	
	
	 
	
	
		
    	
    	
    
	


	
	
	
	    
       




 
	    	
	    
	    	 
	    
				
			
		
	
	 
	
           
		   
		   
		 
            

	
		
	
		
		
	
	



	    	 
	         
	       
	   

	     
			
	     
			



		
			
		

