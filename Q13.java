// Write a Java program to count how many times a specific element appears in the array.

import java.util.Scanner;

public class Q13 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[]arr={1,5,6,4,8,9,7,45,6,2,1,5};
    specific(arr);
   } 
   public static void specific(int[]arr){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your element: ");
    int element=sc.nextInt();
    int sum=0;
    for(int i=0;i<arr.length;i++){
        if (element==arr[i]) {
            sum++;
        }
    }
System.out.println("total element in this your array "+sum);
   }
}
