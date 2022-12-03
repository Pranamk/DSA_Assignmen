import java.util.Scanner;
import java.util.Stack;

public class String_ {
    static Scanner n = new Scanner(System.in);
	public static boolean String_check()
	{   
		System.out.println("enter the string  ");
		String s="(the[is]{invalid))";
		Stack S1= new Stack();
		char str[]=s.toCharArray();
		for( int i=0;i<str.length;i++)
		{
			char check=str[i];
		    if(check=='('||check=='{'||check=='[')
		    {
	            S1.push(check);
	            continue;
		    }
		    if(S1.isEmpty())
		    {
		    	return false;
		    }
		char popChar;
		switch(check)
		{
			case ')':
				popChar=(char)S1.pop();
				if(popChar=='{' || popChar=='[')
				{
					return false;
				}
				break;
			case '}' :
				popChar=(char)S1.pop();
				if(popChar=='('||popChar=='[')
				{
					return false;
				}
				break;
			case ']' : 
				popChar=(char)S1.pop();
				if(popChar=='(' || popChar=='{')
				{
					return false;
				}
				break;
		}
		
		}return(S1.isEmpty());
	}
	public static void main(String[] args) {
		
		if(String_check())
		{
			System.out.println("IS VALID STRING ");
		}else
		{
			System.out.println("INVALID STRING ");
		}
		
	}
}
