import java.util.Scanner;

public class pattern09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int row=1;
        int space= n-1;
        int star= 1;
        while (row <=n) {
            int i = 1;
            while (i<=space) {
                System.err.print("  ");
                i++;
            }
            int j= 1;
            while (j<=star) {
                System.out.print("* ");
                j++;
            }
            row++;
            space--;
            star+=2;
            System.out.println();
        }
    }
}
