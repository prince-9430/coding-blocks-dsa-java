//Write a Java program to calculate the sum of all elements in an array.
public class Q5 {
    public static void main(String[] args) {
        int[]arr={2,5,6,4,8,9,7,4};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("sum of all array is = "+number(arr));
    }
    public static int number(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

        }
        return sum;
    }
}
