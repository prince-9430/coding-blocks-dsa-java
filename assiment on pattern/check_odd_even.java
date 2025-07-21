import java.util.Scanner;

public class check_odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for check odd even:");
        int a=sc.nextInt();
        if (a%2==0) {
            System.out.println("this number is even");
        }else{
            System.out.println("this number is odd");
        }
    }



    
}
