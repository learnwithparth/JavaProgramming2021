import java.util.*;
import java.lang.*;
import java.io.*;

public class Chef_Operator
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b)
            {
                System.out.println(">");
            }
            else if (a<b)
            {
                System.out.println("<");
            }
            else
            {
                System.out.println("=");
            }
        }
    }
}
