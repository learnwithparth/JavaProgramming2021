import java.util.*;

public class helping_chef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, number;
        x= sc.nextInt();
        
            for(int i=0;i<x;i++){
                number = sc.nextInt();
                
                    if (number <= 10) {
                        System.out.println("Thanks for helping Chef!");
                    } else {
                        System.out.println("-1");
                    }
                
            }
        
    }
}
