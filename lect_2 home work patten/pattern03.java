public class pattern03 {
    public static void main(String[] args) {
        int n=3;
        int row=1;
        int space=3;
        int star=1;
        while (row<=n*2) {
            int i=1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            int j=1;
            while (j<=star) {
                System.out.print("* ");
                j++;
            }
          if (row<3) {
            star+=2;
            space--;
          }else{
            star-=2;
            space++;
          }
            row++;
            System.out.println();
        }
    }
}
