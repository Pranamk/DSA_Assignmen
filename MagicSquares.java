import java.util.Scanner;

public class MagicSquares {

	
	static Scanner n = new Scanner(System.in); 

	public static void magicSquares(int S) {
		 int[][] ms=new int[S][S]; 
		   
		 int r=0,c=0; 
		//INOITIALIZATION OF ARRAY TWO DIMENTIONAL
		 for(r=0;r<ms.length;r++)  
		 {
			 for( c=0;c<ms.length;c++)
			 {
				 System.out.println("ENTER INDEXES ");
			ms[r][c]=n.nextInt();
                }
		 }
		// CALL DISPLAY CLASS FOR LOGIC AND DISPLAY RESULT 
				 Display n = new Display();
				  n.display_magicSq(ms,S,r,c);
				
	}
	
	public static void main(String[] args) { 
		System.out.println("ENTER SIZE ");
		int S=n.nextInt();
		magicSquares(S);
	}
}
