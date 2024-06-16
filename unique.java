public class unique {
    public static void main(String[] args) {
        int n=4;
        int arr[]= new int[n];
            

            if(n%2!=0){
                arr=func(arr,n-1);
                arr[arr.length-1]=0;
            }
            else{
                arr=func(arr,n);
            }

            for (int i : arr) {
                System.out.println(i);
            }
        
    }
    static int [] func(int arr[], int n){
        int k=1;
        for(int i=0;i<n/2;i++){
            arr[i]=k;
            k++;
            //System.out.println(arr[i]);
        }
        int k1=1;
        for(int i=n/2;i<n;i++){
            arr[i]=-k1;
            k1++;
            //System.out.println(arr[i]);
        }
        return arr;
    }


    
    
}
