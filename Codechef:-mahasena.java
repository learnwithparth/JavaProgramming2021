import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes her
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int even=0;
		int odd=0;
		for(int i=0;i<n;i++)
		{
		     arr[i]=sc.nextInt();
		     if(arr[i]%2==0)
		     {
		        even++;
		     }
		     else
		     {
		        odd++;
		     }
		}
		if(even>odd)
		System.out.println("READY FOR BATTLE");
		else
		System.out.println("NOT READY");
	}
}