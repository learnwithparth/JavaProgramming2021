import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s = new Scanner(System.in);
          int n1 = s.nextInt();
          int n2 = s.nextInt();
          if(n1 > n2){
              System.out.println(n1 - n2);
          }
          else  System.out.println(n1 + n2);
	}
}
