//Merge two arrays into a third array.
public class pb_10 {
    public static void main(String[] args) {
        int[]arr={2,3,6,5};
         int[]brr={5,2,6,4};
         merge(arr, brr);
    }
    public static void merge(int[]arr,int[]brr){
       int []crr=new int[arr.length+brr.length];
       int n=crr.length;
       
        for(int j=0;j<arr.length;j++){
             crr[j]=arr[j];
       }
       for(int k=0;k<brr.length;k++){
        crr[arr.length+k]=brr[k];
       }
    
       for(int i=0;i<crr.length;i++){
        System.out.print(crr[i]+" ");
       }
    }
}
