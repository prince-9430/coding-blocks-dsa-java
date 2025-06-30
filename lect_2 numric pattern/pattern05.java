import java.util.Scanner;

public class pattern05{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int row = 1;
    int space =4;
    int star =1;
    while (row<=n) {
        int i=1;
        while (i<=space) {
           System.out.print("  ");
           
           i++; 
        }
        int j=1;
        int val=1;

        while (j<=star) {
            System.out.print(val+" ");
                if (val<row) {
          val++;  
        }
        else{
            val--;
        }
            j++;
        }
    
        row++;
        space--;
        star+=2;
        System.out.println();
    }
}
}