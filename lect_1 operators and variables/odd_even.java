import java.util.*;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUM");
        int num = sc.nextInt();
        if (num%2 == 0) {
            System.out.println("EVEN NUMBER");
        }
        else {
            System.out.println("ODD NUMBER");
        }
        
    }
}
