// Count how many positive and negative numbers are in the array.
public class pb_9 {
   public static void main(String[] args) {
    int[]arr={2,2,6,-5,-8,-5,5,8,-1};
    frequency(arr);
   } 
   public static void frequency(int[]arr){
    int negative=0;
    int positive=0;
    for(int i=0;i<arr.length;i++){
       
        if (arr[i]>0) {
            positive++;
        }
        else{
            negative++;
        }
    }
   System.out.println("total number of negative number in array is: "+negative);
   System.out.println("total number of postive number in array is: "+positive);
    }
   
}
