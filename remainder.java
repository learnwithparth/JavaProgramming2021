import java.util.Scanner;
public class remainder {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int den = in.nextInt();
        System.out.println(num%den);
        in.close();
    }
}