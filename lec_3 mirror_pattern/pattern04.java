import java.util.Scanner;

public class pattern04 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space= 4;
        int star=1;
        while (row<=n*2-1) {
            int i =1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            int j=1;
            while (j<=star) {
                System.out.print("* ");
                j++;
            }
            if (row<n) {
                space--;
                star+=2;
            }else{
                space++;
                star-=2;
            }
            row++;
            System.out.println();
        }
    }
}
