import java.util.*;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR AGE:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("YIU ARE ELIGBLE FOR VOTE");
            
        }
        else{
            System.out.println(
                "YOU ARE NOT ELIGBLE FOR VOTE"
            );
        }
    }
}
