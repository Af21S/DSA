public class assign1_rec {
    public static  int[] arr= {1,2,3,4,5};
    public static void main(String[] args) {
        
        System.out.println(func1(arr));  

         
    }

    /* static int sum(int i, int j) {
        int sum;
        return sum = arr[i]+arr[j];
    } */

    static int[] func1(int[] arr){
        int arr2[] = new int[20];
        for(int i=0;i<arr.length-1;i++){
            arr2[i]=arr[i]+arr[i+1];
            
       }
        arr=arr2;
        if(arr.length==1){return arr;}
        return func1(arr);
    }

    /* static int[] func2(int[] arr) {
        int arr2[] = new int[20];
        for(int i=0;i<arr.length-1;i++){
            arr2[i]=arr[i]+arr[i+1];
            
       }
       return arr2;
       
    } */
    

}
