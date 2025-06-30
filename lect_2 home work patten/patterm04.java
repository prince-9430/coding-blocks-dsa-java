public class patterm04 {
    public static void main(String[] args) {
        int n=4;
        int row=1;
        int star=1;
        int val=1;
        while (row<=n) {
            int i=1;
            
            while (i<=star) {
                System.out.print(val+" ");
                 val++;
                i++;
            }
            star++;
            row++;
           
            System.out.println();
        }
    }
}
