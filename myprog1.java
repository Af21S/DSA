import java.util.*;
class myprog1{
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        //func1(n);
        System.out.println(fib(n));

       
        
    }
    static void func1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        func1(n-1);
        

    }
    static int fib(int n){
        if(n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        
            return fib(n-1)+fib(n-2);
        
    }

   
 

}
