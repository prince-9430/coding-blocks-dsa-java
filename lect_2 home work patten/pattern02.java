public class pattern02 {
    public static void main(String[] args) {
        int n=4;
        int row=1;
        int space=3;
        int star=1;
        while (row<=n) {
            int i=1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            int j=1;
            int val=row;
            while (j<=star) {
                System.out.print(val+" ");
             if (row<=j) {
                val--;
             }else{
                val++;
             }
                j++;
            }
            space--;
            star+=2;
            row++;
            System.out.println();
        }
    }
}
