import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        //System.out.println("input string value");
       
        
      int N=4;
      int var=N;
    

        for(int i=0;i<=2*N-1;i++){

            if(i<N){
            for(int j=1;j<=2*N-2*i-1;j++){
                System.out.print(var);
            }
                
                var=var-1;
                System.out.println();}
                
    
    
            if(i>=N){
                var=var+1;
                if(var==1){continue;}
               
                for(int j=1;j<=2*i-2*N+1;j++){
                    System.out.print(var);
                    
                }
            
                    
                    System.out.println();
                
            }
            
            
            }

                

        }
    }

