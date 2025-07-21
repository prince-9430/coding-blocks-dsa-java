//Write a Java program to left rotate the elements of an array by 3 position.
public class rotate1_arr {
  public static void main(String[] args) {
    int []arr={1,2,3,4,5,6,7,8};
    int k=3;
    rotate(arr,k);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
  }  
  public static void rotate(int[]arr,int k){
   int n=arr.length;
   k=k%n;
   for(int j=1;j<=k;j++){
 int last_ele=arr[arr.length-1] ;
   for(int i=n-2;i>=0;i--){
    arr[i+1]=arr[i];
   }
   arr[0]=last_ele;
   }
  
  }
}
