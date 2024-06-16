import java.util.Arrays;

public class rotate_array {
    public static void main(String[] args) {
        //nums = [1,2,3,4,5,6,7], k = 3
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        int n=nums.length;
        int [] result=new int[n];
        for(int i=0;i<n;i++){
            result[(i+k)%n]=nums[i];

        }
        System.out.println(Arrays.toString(result));
    }
    
}
