// Delete an element from array at a given index.

import java.util.Scanner;

public class pb_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={2,5,6,4,5};
        System.out.println("please enter a number for delete element: ");
        int index=sc.nextInt();
        Delete(arr, index);
    }
    public static void Delete(int[]arr,int index){
     int n=arr.length;
   if(index <0||index>=n) {
        System.out.println("this number not exit in array "); 
        return;
    }
       
     
     for(int i=index;i<arr.length-1;i++){
        arr[i]=arr[i+1];
     }
       for(int j=0;j<arr.length-1;j++){
        System.out.print(arr[j]+" ");
     }
    }
}
