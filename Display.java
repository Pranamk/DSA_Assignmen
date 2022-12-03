
public class Display {
	
	public void display_magicSq(int ms[][],int S,int r,int c)
	{
		
		
	    int row[][] =new int[S][S],col[][] =new int[S][S],dig[][]=new int[S][S];
	    int k=0,l=0;
	for( r=0;r<ms.length;r++)
	 { 
		 for( c=0;c<ms.length;c++)
		 {  
			
           row[k][l]+=ms[c][r];     
           col[l][k]+=ms[r][c];    
           
           
           if(r==c)
           {
           	dig[k][l]+=ms[r][c];   
           }
		 }
		 if(row[k][l]!=col[k][l])
		 {
			 System.out.println("ROW : "+row[k][l]);
			 System.out.println("COLOUMN : "+col[k][l]);
			 System.out.println("NOT MAGIC NUMBER ");
		 }
		 if (row[k][l]==col[l][k] && dig[k][l]==col[l][k])
		 {
			 System.out.println("ROW : "+row[k][l]);
			 System.out.println("COLOUMN : "+col[k][l]);
			 System.out.println("DIAGONAL : "+dig[k][l]);
			 System.out.println("MAGIC NUMBER ");
		 }
	 } 
	 
	}
}
