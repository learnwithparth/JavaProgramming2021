
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		if(n % 4 ==0){
		    System.out.println(++n);
		}else{
		    System.out.println(--n);
		}
	}
}
