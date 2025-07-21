//remove dublicate array

public class remove_dublicate {
   public static void main(String[] args) {
    int[]arr={2,4,5,6,1,2,5,8,5,6,5};
    remove(arr);
   } 
   public static void remove(int[]arr){
    int []brr=new int[arr.length];
    int index=0;
    for(int i=0;i<arr.length;i++){
        boolean dublicate=false;
        for(int j=0;j<index;j++){
            if (arr[i]==arr[j]) {
                dublicate=true;
                break;
            }
        }
        if (!dublicate) {
            brr[index]=arr[i];
            index++;
        }

    }
            for(int k=0;k<index;k++){
    System.out.print(brr[k]+" ");
}

   }
}
