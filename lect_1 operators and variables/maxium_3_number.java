import java.util.*;

public class maxium_3_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println("yes a is a greater number:" + a);

        }
        else if (b >= a && b >= c){
            System.out.println("yes b is greater number" + c);
        }
        else{
            System.out.println("c is a greater number" );
        }
    }
}
