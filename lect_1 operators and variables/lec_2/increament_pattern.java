package lec_2;

import java.util.Scanner;

public class increament_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = 1;
    int star = n;
    while(row <= n){
        int i = 1;
        while (i <= star) {
            System.out.print("* ");
            i++;
        }
        star--;
        row++;
        System.out.println();
    }  
    }
  
    
}
