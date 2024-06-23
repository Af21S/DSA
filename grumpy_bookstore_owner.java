public class grumpy_bookstore_owner {
    public static void main(String[] args) {
        int arr[]={1,0,1,2,1,1,7,5};
        int []grumpy={0,1,0,1,0,1,0,1};
        int minutes=3;
        int k=0,r=0;
        int max=0,sum;
        while(k<arr.length-(minutes-1)){
            sum=0;r=0;
            for(int i=k;i<k+minutes;i++){
                sum+=arr[i];
                r=i;
            }
        
      //  if(r+1<arr.length){

      if(k>0){
        for(int i=0;i<k;i++){
            if(grumpy[i]==0){
                sum+=arr[i];
            }

        }
      }
            for(int i=r+1;i<arr.length;i++){
                if(grumpy[i]==0){
                    sum+=arr[i];
                }
               
            }
            
      //  }
           
            if(sum>max){
                max=sum;
            }
            k++;
            
    }
    System.out.println(max);
}
}
