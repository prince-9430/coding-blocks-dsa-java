public class HCF{
   public static void main(String[] args) {
    int divisor=36;
    int divident=62;
    while (divident%divisor!=0) {
        int remender=divident%divisor;
        divident=divisor;
        divisor=remender;
    }
    System.out.println(divisor);
   } 
}