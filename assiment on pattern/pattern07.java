import java.util.Scanner;

public class pattern07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        char val='A';
        while (row<=n) {
            int i=1;
            
            while (i<=star) {
                System.out.print(val+" ");
                i++;
            }
            row++;
            val++;
            star++;
            System.out.println();
        }
    }
}
