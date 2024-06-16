import java.util.Arrays;

public class find_even_digits {
    public static void main(String[] args) {
        int [] nums={12,123,1234,1};
        int count=0;
       // String str=" ";
      
       
        
        //System.out.println("Original Array: "+str);
        for(int i=0;i<nums.length;i++){
            String str="";
            int len=0;
            str=Integer.toString(nums[i]);
           // System.out.println("String: "+str);
            len=str.length();
            if(len%2==0){
                count++;
            }
        }
        System.out.println(count);
            
    }
    
}
