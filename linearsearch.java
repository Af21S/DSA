public class linearsearch {
    public static void main(String[] args) {
        int [] arr ={3,2,5,6,8,9};

        System.out.println("found at position "+search(arr, 9, 0));
    }
    static int search(int[] arr,int elem,int i){
        if(i==arr.length){ return 0;}
        if(arr[i]==elem){return i+1;}
        return search(arr, elem, i+1);


    }
}
