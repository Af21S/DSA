public class flipping_image {
    public static void main(String[] args) {
        int [][] arr = { {1,1,0},{1,0,1},{0,0,0}};
        int [] arr1 = new int[arr[1].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                
                arr[i]= reverse(arr[i]);
                
              //  arr[i][j]=replace(arr[i][j]);
            }
        }
        
    }

    private static int[] reverse(int[] arr) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'replace'");
        int arr1[]= new int[5];  
        int n=arr.length;
        int i=arr.length-1;
        int num=0;
        // for (int j : arr) {
        //     num=num*10+arr[j];
        // }
        int k=num;
        while(k>=0&&i>=0){
            arr1[i]=k%10;
            i--;
        }
        for (int j : arr1) {
            System.out.println(j);
        }
        return arr1;

        
     }

    // private static int reverse(int i) {
    //     // TODO Auto-generated method stub
    //    //throw new UnsupportedOperationException("Unimplemented method 'reverse'");
    // }
}
