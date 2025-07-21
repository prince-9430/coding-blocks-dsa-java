// Copy all elements of one array into another.
public class pb_4 {
   public static void main(String[] args) {
    int[]arr={2,5,6,4,3,2};
    copy(arr);
   } 
   public static void copy(int[]arr){
    int[]brr=new int[arr.length];
    for(int i=0;i<arr.length;i++){
        brr[i]=arr[i];
    }
    System.out.print("copy array in another element ");
     for(int j=0;j<brr.length;j++){
       System.out.print(brr[j]+" ");
    }
   }
}
