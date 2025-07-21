//Write a Java program to left rotate the elements of an array by 1 position.
public class Q14 {
   public static void main(String[] args) {
    int []arr={5,8,9,7,6,4};
    rotate(arr);
   } 
   public static void rotate(int[]arr){
    int n=arr.length;
    int first=arr[0];
    for(int i=0;i<n-1;i++){
        arr[i]=arr[i+1];
    }
    arr[n-1]=first;
    for(int j=0;j<n;j++){
       System.out.print(arr[j]);
    }
   }
}
