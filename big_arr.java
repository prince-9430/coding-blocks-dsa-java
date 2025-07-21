
public class big_arr {
    public static void main(String[] args) {
        int []arr={89,78,21,63,58,9,778,889,77,45};
        bigger(arr);
        
    }
    public static void bigger(int[]arr){
int largest=arr[0];
for(int i=1;i<arr.length;i++){
    if (largest<arr[i]) {
       largest=arr[i];  
    }   
}
System.out.println(largest);
    }
}
