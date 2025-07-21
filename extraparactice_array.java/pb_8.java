//Insert an element in array at a given position.

import java.util.Scanner;

public class pb_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={5,8,9,8,4};
        int insert=sc.nextInt();
        int index=sc.nextInt();
        add(arr, insert, index);
    }
    public static void add(int[]arr,int insert,int index){
        int n=arr.length;
       int[]brr=new int[n+1];
        for(int i=0;i<n;i++){
        brr[i]=arr[i];
       }
       for(int i=n;i>index;i--){
        brr[i]=brr[i-1];
       }
       brr[index]=insert;
        
        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
    }
}
