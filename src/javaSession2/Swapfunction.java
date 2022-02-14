package javaSession2;

public class Swapfunction {

	
		// TODO Auto-generated method stub
		public static void swap (int sachwinHouse[],int alokHouse[]) {
			int temp[]= sachwinHouse;
			sachwinHouse = alokHouse;
			alokHouse = temp;
		}
		public static void main(String[] args) {
		 int  sachwinHouse[] = { 12,13};
		 int   alokHouse[]= {15,16,30};
		 System.out.println("sachwinHouseaddress" + sachwinHouse);
		 System.out.println("alokHouseaddress"+ alokHouse);
//		 int temp[]=  sachwinHouse;
//		 sachwinHouse= alokHouse;
//		 alokHouse = sachwinHouse;
		 swap(sachwinHouse ,alokHouse);
		 System.out.println("sachwinHouseaddress" + sachwinHouse); //no changes in addresses
		 System.out.println("alokHouseaddress"+ alokHouse);
				 
		 
	}	
	}


