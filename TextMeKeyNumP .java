
public class TextMeKeyNumP {

	public static void main(String[] args) {
		
		String str = "cat ";
				TextMeKeyNumP Text = new TextMeKeyNumP();
	                Text.logic(str);
	}
	
	public void logic(String str)
	{ 
	    char[] str1=str.toCharArray();	
	       int  counter=0;
	    for(int j = 0;j<str1.length;j++)
	    {     char w = str1[j];
	    	if((w=='a'||w=='b'||w=='c')||(w=='d'||w=='e'||w=='f'))
	    	{
	    		if(w=='a')
	    			counter=counter+1;
	    		else if (w=='b')
	    			counter=counter+2;
	    		else if (w=='c')
	    			counter=counter+3;
	    
	    		else if(w=='d')
	    			counter=counter+1;
	    		else if (w=='e')
	    			counter=counter+2;
	    		else if (w=='f')
	    			counter=counter+3;
	    	}
	    	if((w=='g'||w=='h'||w=='i')||(w=='j'||w=='k'||w=='l')||(w=='m'||w=='n'||w=='o'))
	    	{
	    		if(w=='g')
	    			counter=counter+1;
	    		else if (w=='h')
	    			counter=counter+2;
	    		else if (w=='i')
	    			counter=counter+3;
	    		
	    		else if(w=='j')
	    			counter=counter+1;
	    		else if (w=='k')
	    			counter=counter+2;
	    		else if (w=='l')
	    			counter=counter+3;
	    
	    		else if(w=='m')
	    			counter=counter+1;
	    		else if (w=='n')
	    			counter=counter+2;
	    		else if (w=='o')
	    			counter=counter+3;
	    	}
	    	if((w=='p'||w=='q'||w=='r'||w=='s')||(w=='t'||w=='u'||w=='v')||(w=='w'||w=='x'||w=='y'||w=='z'))
	    	{
	    		if(w=='p')
	    			counter=counter+1;
	    		else if (w=='q')
	    			counter=counter+2;
	    		else if (w=='r')
	    			counter=counter+3;
	    		else if (w=='s')
	    			counter=counter+4;
	    		
	    		else if(w=='t')
	    			counter=counter+1;
	    		else if (w=='u')
	    			counter=counter+2;
	    		else if (w=='v')
	    			counter=counter+3;
	    			
	    		else if(w=='w')
	    			counter=counter+1;
	    		else if (w=='x')
	    			counter=counter+2;
	    		else if (w=='y')
	    			counter=counter+3;
	    		else if (w=='z')
	    			counter=counter+4;
	    			
	    	}
	    	if(w==' ')
	    	{
	    		counter=counter+1;
	    	}
	    }
	  System.out.println("TOTAL TYPE : "+counter);
	}
	
}
