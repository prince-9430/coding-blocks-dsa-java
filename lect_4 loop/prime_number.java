import java.util.Scanner;

public class prime_number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    for(int i=2; i<n;i++){
if (n%i==0) {
    count++;
    break;
}
    }
    if (count>=1) {
        System.out.println(" this is not a prime number");
    }else{
        System.out.println("yes this is a prime number");
    }
  }  
}
