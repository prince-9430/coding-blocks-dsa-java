//Write a Java program to find the smallest element in an array.
public class Q11 {
    public static void main(String[] args) {
        int []arr={78,30,65,20,35,45,80};
        Search(arr);
}
      
public static void Search(int[]arr){
    int smaller=arr[0];
    for(int i=1;i<arr.length;i++){
if (arr[i]<smaller) {
    smaller=arr[i];
}
    }
   System.out.println("Smallest number of array is "+smaller);
    }
}
