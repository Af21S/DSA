public class Sortedornot {
    public static void main(String[] args) {
        int [] arr = {1,2,90,4,5};
        System.out.println( rec(0,arr));
        
    }
    static boolean rec(int i, int [] arr){
        if(i==arr.length-1){
            return true; 
        }
        if(arr[i]<arr[i+1]){
            return rec(i+1,arr);
        }
        return false;
        
    }
}
