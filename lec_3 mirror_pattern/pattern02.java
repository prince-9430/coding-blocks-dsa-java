import java.util.Scanner;

public class pattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = 4;
        int star = 1;
        while (row <=n*2-1) {
            int i = 1;
            while (i<=space) {
                System.out.print("   ");
                i++;
            }
            int j=1;
            while (j<=star) {
                System.out.print("*  ");
                j++;
            }
            if (row<5) {
                space--;
                star++;
            }else{
                space++;
                star--;
            }
            row++;
            System.out.println();
        }
    }
}
