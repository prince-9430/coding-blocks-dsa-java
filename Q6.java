//Write a program to reverse an array without using another array.
public class Q6 {
    public static void main(String []args){
        int[]arr={10,20,30,40,50};
         int start=0;
        int end=arr.length-1;
        while (start<end) {
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
            start++;
            end--;
        }
           System.out.println("Reveresd array");
     for(int num:arr){
       System.out.print(num+" ");
        }
}

}
