public class pattern14 {
    public static void main(String[] args) {
        int n =5;
        int row=1;
       int star=5;
        int space=n-5;
        while (row<=n) {
        int i=1;
        while(i<=star){
            System.out.print("* ");
            i++;
        }
        int j=1;
        while (j<=space) {
            System.out.print("  ");
            j++;
        }
        int k=1;
        while (k<=star) {
            System.out.print("* ");
            k++;
        }
        row++;
        star--;
        space+=2;
       
        System.out.println();
        }
    }
}

