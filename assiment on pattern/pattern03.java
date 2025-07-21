import java.util.Scanner;

public class pattern03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=4;
        while (row<=n) {
            int i=1;
            while (i<=star) {
                System.out.print("* ");
                i++;
            }
            row++;
            star--;
            System.out.println();
        }
    }
}
