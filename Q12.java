//12. Write a Java program to copy all elements of one array into another
public class Q12 {
    public static void main(String[] args) {
        int[]arr={2,2,5,6,9,8,9};
        copy(arr);
    }
    public static void copy(int[]arr){
        int[]brr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            brr[i]=arr[i];
        }
         for(int j=0;j<arr.length;j++){
           System.out.print(brr[j]+" ");;
        }
    }
}
