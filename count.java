import java.util.*;
public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
       
        System.out.println( func(n, count));

        
        
    }
    static int func(int n,int count){
        if(n==0){return count;}
        int dig=n%10;
        if(dig==0){count++;}
        n=n/10;
        
        return func(n,count);
    }
    
}
