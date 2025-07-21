//Write a Java program to sort an array in ascending order.
public class ascendeing_arr {
    public static void main(String[] args) {
        int []arr={2,4,9,8,7,3,6,4,1,5,8}; 
        ascending(arr);
    }
   
   public static void ascending(int[]arr){
for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        if (arr[i]>arr[j]) {
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp; 
        }
    }
}
System.out.println("Ascending order of array");
for(int k=0;k<arr.length;k++){
    System.out.print(arr[k]+" ");
}
   }
}

