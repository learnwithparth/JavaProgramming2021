import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner=new Scanner(System.in);
		int t=scanner.nextInt();
		String[] output=new String[t];
		for(int i=0;i<t;i++){
		    output[i]="";
		    int n=scanner.nextInt();
		    int k=scanner.nextInt();
		    int[] a=new int[n];
		    for(int j=0;j<n;j++){
		        a[j]=scanner.nextInt();
		        if(a[j]<=k){
		            output[i] += 1;
		            k=k-a[j];
		        }
		        else{
		            output[i] += 0;
		        }
		    }
		}
		for(int i=0;i<t;i++){
		    System.out.println(output[i]);
		}
	}
}