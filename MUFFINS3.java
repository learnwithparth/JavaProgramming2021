import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
// your code goes here
Scanner sc = new Scanner(System.in);
int T = sc.nextInt();
for(int i=1 ; i<=T ; i++)
{
   int N = sc.nextInt();
   System.out.println((int)Math.sqrt(N));
}
}
}