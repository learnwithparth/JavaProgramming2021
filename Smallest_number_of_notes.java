package Code_chef;
 import java.util.*;
import java.lang.*;
import java.io.*;

class  Smallest_number_of_notes 

{
	public static void main (String[] args) throws java.lang.Exception
	{
		  Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    if(t>=1 && t<=1000){
        for(int i=0;i<t;i++){
            int sum=0;
            int n=sc.nextInt();
            int arr[]={1,2,5,10,50,100};
            for(int j=5;j>=0;j--){
                sum+=(int)n/arr[j];
                n=n%arr[j];
            }
            System.out.println(sum);
        }
    }
	}
}
