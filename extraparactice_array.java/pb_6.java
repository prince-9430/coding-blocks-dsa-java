//Count total number of duplicate elements in an array.
public class pb_6 {
    public static void main(String[] args) {
    int []arr={2,5,8,7,9,5,4,6,8,4,6,9,8,7};
    total(arr);
  }  
  public static void total(int[]arr){
    int count=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<i;j++){
            if(arr[i]==arr[j]){
               count++;
               break;
            }
         
        }
    }
    System.out.print(count); 
  }
}
