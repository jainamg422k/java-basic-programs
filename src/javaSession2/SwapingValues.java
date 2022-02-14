package javaSession2;

public class SwapingValues {

	public static void swap (int sachwinHouse[],int alokHouse[],int roomno) {
		int temp= sachwinHouse[roomno];
		sachwinHouse[roomno] = alokHouse[roomno];
		alokHouse[roomno] = temp;    	
	}
	public static void main(String[] args) {
	 int  sachwinHouse[] = { 12,13};
	 int   alokHouse[]= {15,16,30};
	 System.out.println("sachwinHouse 0 room no value " + sachwinHouse[0]);
	 System.out.println("alokHouse 0 room no value "+ alokHouse[0]);
//	 int temp[]=  sachwinHouse;
//	 sachwinHouse= alokHouse;
//	 alokHouse = sachwinHouse;
	 swap(sachwinHouse ,alokHouse,0 ); // 2k ,3k, 0;
	 System.out.println("sachwinHouse 0 room no value " + sachwinHouse[0]);
	 System.out.println("alokHouse 0 room no value "+ alokHouse[0]);
	 
	

	}

}
