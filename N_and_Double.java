public class N_and_Double {
    public static void main(String[] args) {
        //edge case of 0 not included
        int[] arr = {10, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i] * 2;
        }
        int flag=0;

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr.length;j++){
                if (arr1[i]==arr[j]){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    
}
}