//Write a Java program to find the largest element in an array.
public class Q4 {
    public static void main(String[] args) {
        int []arr={100,20,30,50,30};
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]>largest) {
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
