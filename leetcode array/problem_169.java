public class problem_169 {
    public static void main(String[] args) {
        int[]arr={2,3,2};
        majaor(arr);
    }
    public static void majaor(int[]arr){
        int n=arr.length;
        int majortycount=n/2;
for(int i=0;i<n;i++){
    int count=0;
for(int j=0;j<arr.length;j++){
    if (arr[i]==arr[j]) {
        count++;
    }
}
if (count>majortycount) {
    System.out.println("majority element is: "+arr[i]);
    return;
}
}
System.out.println("no majority element found");
    }
}
