public class diagonal_matrix {
    public static void main(String[] args) {
        int [][]arr={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int m=arr.length;
        int n=arr[0].length;
        int sum1=0,sum2=0;
        int sum=0;

        for(int i=0;i<m;i++){
            sum1+=arr[i][i];
        }
        int k=1;
        for(int i=0;i<m;i++){
            sum2+=arr[i][arr.length-k];
            k++;
        }
        if(m%2!=0){
           
         sum=sum1+sum2-arr[(int)m/2][(int)n/2];
         System.out.println(sum);
        }
        else{
            sum=sum1+sum2;
            System.out.println(sum);
        }
    }
    
}
