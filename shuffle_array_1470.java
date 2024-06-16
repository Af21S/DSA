import java.util.Arrays;

public class shuffle_array_1470 {
    public static void main(String[] args) {
        //nums = [1,2,3,4,4,3,2,1], n = 4
        int nums[]={1,2,3,4,4,3,2,1};
        int n=4;
        int [] result=new int[2*n];
        int i=0,start1=0;
        int start2=n;
        while(i<2*n){
            result[i]=nums[start1];
            if(i+1!=2*n){
            result[i+1]=nums[start2];}
            i++;  
            start1++;
            start2++;        
        }
        System.out.println(Arrays.toString(result));
    }
}