public class pb_1{
    public static void main (String[] args){
int[]arr={1,5,4,6,5,8,79,6,32,15,4,8};
sort(arr);
for(int k=0;k<arr.length;k++){
    System.out.print(arr[k]+" ");
}
    }
    public static void sort(int[]arr){
        for(int i=0;i<arr.length;i++){
            int mini=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[mini]) {
                    mini=j;
                }
            }
           int temp=arr[i];
           arr[i]=arr[mini];
           arr[mini]=temp;
        }
    }
}