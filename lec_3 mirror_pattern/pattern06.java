import java.util.Scanner;

public class pattern06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int row =1;
        int space = 4;
       
        int betweenspace = -1;
       
        while (row<=n) {
            int i = 1;
            while (i<=space) {
              
                System.out.print("  ");
                i++;
            }
           System.out.print("* ");
               int j = 1;
            while (j<=betweenspace) {
              
                System.out.print("  ");
                j++;
            }
            if (row >=2 && row<n) {
                   System.out.print("* ");
            }
        
            if (row<=n/2) {
               space--;
              
              betweenspace+=2;
            

            }
            else{
                space++;
             
              betweenspace-=2;
             
            }
            row++;
            System.out.println();
        }
    }
}
