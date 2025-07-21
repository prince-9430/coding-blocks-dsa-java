//Write a program to count the number of even and odd elements in an array.
public class Q8 {
    public static void main(String[] args) {
        int[]arr={2,5,6,3,4,2,7,9,8};
        even_odd(arr);
    }
    public static void even_odd(int[]arr){
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0) {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Total number of even is: "+even);
        System.out.println("Total number of odd is: "+odd);
    }
}
