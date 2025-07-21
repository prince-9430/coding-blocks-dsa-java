//Write a program to search for a number in an array (Linear Search).

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[]arr={2,6,3,5,4,7,8,9};
        int user =sc.nextInt();
        Search(arr, user);
    }
    public static void Search(int[]arr,int user){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==user) {
              System.out.println("yes this number availble in array on the "+ i +" index"); 
            }
        }
    }
}
