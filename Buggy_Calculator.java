import java.util.*;

public class Buggy_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count= sc.nextInt();
        int a,b,c;
        for(int i=0;i<count;i++){
            a= sc.nextInt();
            b=sc.nextInt();
            c=(a+b)-10;
            System.out.println("The buggy output is "+c);
        }
    }
}
