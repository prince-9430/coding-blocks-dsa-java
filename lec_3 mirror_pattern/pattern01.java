import java.util.Scanner;

public class pattern01{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      int n =5;
      int row = 1;
      int star=1;
      while (row<=n*2-1) {
        int i=1;
        while (i<=star) {
            System.out.print("* ");
            i++;
        }
        if (row<n) {
            star++;
        }else{
            star--;
        }
        row++;
        System.out.println();
      }
    }
}
