public class remove_duplicates {
    public static void main(String[] args) {


        int []nums={1,1,2};
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    for (int k = j; k < n - 1; k++) {
                        nums[k] = nums[k + 1];
                    }
                    j=j-1;
                    n=n-1;

                }
            }
        }

int k=0;
        for(int i=0;i<n;i++){
            //System.out.println(nums[i]);
            k+=1;
           
        }
     System.out.println(k);



     

    

      
    }


}
