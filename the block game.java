import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    for(int i=0;i<t;i++)
	    {
	        int n=s.nextInt();
	        int rev=0,temp=n;
	        while(n!=0)
	        {
	            int rem=n%10;
	            rev=rev*10+rem;
	            n=n/10;
	        }
	        if(temp==rev)
	        System.out.println("wins");
	        else
	        System.out.println("loses");
	       
	    }
	}
}
