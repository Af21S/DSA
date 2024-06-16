import java.util.*;
public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [10];
        System.out.println("enter array elements");
        for(int i=0;i<6;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println(BS(arr, 0, arr.length-1, 11));
        
    }
    static int BS(int arr[],int s,int e,int target){
        if (s>e){return -1;}

        int m=(s+e)/2;
        if (arr[m]==target){
            return m;
        }
        if(arr[m]<target){
            return BS(arr,m+1,e,target);
        }
        return BS(arr,s, m-1, target);
    }

}
