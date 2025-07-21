//Write a Java program to find the smallest element in an array.
public class pb_3 {
   public static void main(String[] args) {
    int []arr={5,8,7,9,4,6,2,5,5,6,6};
    smallest(arr);
   } 
   public static void smallest(int[]arr){
    int n=0;
    int smallest=0;
    for(int i=1;i<arr.length;i++){
        if (arr[n]>arr[i]) {
            arr[n]=arr[i];
        }
    }
    System.out.println("smallest element in array is "+ arr[n]);
   }
}
