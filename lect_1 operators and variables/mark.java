import java.util.*;

public class mark {
    public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int mark = sc.nextInt();
if (mark >= 90) {
    System.out.println("great you have a grade");
}
else if (mark >= 75) {
    System.out.println("great you have b grade");
}
else if (mark >= 50) {
    System.out.println("great you have c grade");
}
else if (mark >= 30) {
    System.out.println(" you have d grade");
}
else{
    System.out.println("you are Failed");
}
    }
}
