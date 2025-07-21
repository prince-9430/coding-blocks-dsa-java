//Sort elements of array in ascending order (without using built-in sort).
public class pb_5 {
  public static void main(String[] args) {
    int []arr={2,5,8,7,9,5,4,6,8,4,6,9,8,7};
    ascending(arr);
  }  
  public static void ascending(int[]arr){
    for(int i=0;i<arr.length;i++){
        for(int j=1;j<arr.length;j++){
            if (arr[i]<arr[j]) {
              int temp =arr[i];
              arr[i]=arr[j];
              arr[j]=temp;  
            }
        }
    }
     for(int k=1;k<arr.length;k++){
          System.out.print(arr[k]+" "); 
        }
  }
}
