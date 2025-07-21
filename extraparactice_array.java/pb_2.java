public class pb_2{
    public static void main (String[] args){
    int[]arr={5,2,6,7,8,4,6};
    Insertion_sort(arr);
     for (int i=0;i<arr.length;i++){
        System.err.print(arr[i]+" ");
     }
    }
    public static void Insertion_sort(int[]arr){
        for (int i=1;i<arr.length;i++){
            int picked=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>picked) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=picked;
        }
    }
}