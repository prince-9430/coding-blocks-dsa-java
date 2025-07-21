//get the user integer input find in the array given and print 
//index other wise print -1 with the help of function  

import java.util.Scanner;

public class basic_question1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[]arr={10,20,3,4,-9,10};
    int item =sc.nextInt();
    System.out.println(Search(arr, item));
  } 
  public static int Search(int[]arr,int item){
    for(int i=0;i<arr.length;i++){
        if (arr[i]==item) {
            return i;
        }
    }
    return -1;
  } 
}
