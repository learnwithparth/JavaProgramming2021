import java.util.*;
public class Reversethenumber{
    public static void main(String args[]){
        int num=456578, rev=0;
        while(num!=0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of this number:"+rev);
    }
}