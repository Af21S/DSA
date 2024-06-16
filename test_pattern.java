public class test_pattern {
    public static void main(String[] args) {
        
        // for(int i=2;i<9;i++){

        //     int var=4;
        //     if(i<5){
        //     for(int j=1;j<=i-1;j++){
                
        //         System.out.print(var+" ");
        //         var=var-1;    
        //     }
        //     System.out.println();}
        //     int var1=4;
        //     if(i>5){
        //         for(int j=1;j<10-i-1;j++){
                
        //             System.out.print(var1+" ");
        //             var1=var1-1;    
        //         }
        //         System.out.println();
                


        //     }
        // }
        


        int N=4;
        int var=N;
        int var1=N;

        for(int i=0;i<=2*N-1;i++){

        if(i<N){
        for(int j=1;j<=2*N-2*i-1;j++){
            System.out.print(var+" ");
        }
            
            var=var-1;
            System.out.println();}
            


        if(i>=N){
            var=var+1;
            if(var==1){continue;}
           
            for(int j=1;j<=2*i-2*N+1;j++){
                System.out.print(var+" ");
                
            }
        
                
                System.out.println();
            
        }
        
        
        }
          
    }

}
