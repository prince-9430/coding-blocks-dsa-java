public class function_prime {
    public static void main (String []args){
     int result =prime(10);
     if (result ==1) {
        System.out.println("this is a prime number");
     }else{
        System.err.println("this not a prime number");
     }
    }
    public static int prime(int a){
         int count=0;
        for(int i=2;i<a;i++){
            if (a%i==0) {
              
               count++;
               break; 
            }
           
        }
         if (count ==0 && a>1) {
                return 1; //1 means prime
            }else{
                return 0;//0 means not prime
            }
           
    }
    
}
