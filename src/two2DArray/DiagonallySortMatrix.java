package two2DArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 LEETCode question
 A matrix diagonal is a diagonal line of cells starting from some cell in either the topmost row or leftmost column and going 
 in the bottom-right direction until reaching the matrix's end. For example, the matrix diagonal starting from mat[2][0],
  where mat is a 6 x 3 matrix, includes cells mat[2][0], mat[3][1], and mat[4][2].

Given an m x n matrix mat of integers, sort each matrix diagonal in ascending order and return the resulting matrix

 */
public class DiagonallySortMatrix {
    public static void diagonalSort(int cr,int cc,int [][]mat){
    	List<Integer> currDiag = new ArrayList<>();
    	int r = cr;
    	int c = cc;
    	while(r < mat.length && c < mat[0].length) {
    		currDiag.add(mat[r][c]);
    	   r++;
    	   c++;
    	}
    	int idx = 0;
    	Collections.sort(currDiag);
    	while(cr < mat.length && cc< mat[0].length) {
    		mat[cr][cc] =  currDiag.get(idx);
    		idx++;
    		cr++;
    		cc++;
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [][] matrix = {{3,3,1,1},{2,2,1,2},{1,1,1,2} };
    for(int cr = 0; cr<matrix.length; cr++) {
    	
    	diagonalSort(cr,0,matrix);
    }
for(int cc = 1; cc<matrix[0].length; cc++) {
    	
    	diagonalSort(0,cc,matrix);
    }
    System.out.println(Arrays.deepToString(matrix));
	}

}
