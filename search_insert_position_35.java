import java.util.ArrayList;
import java.util.Arrays;

public class search_insert_position_35 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        ArrayList<Integer> temp = new ArrayList<Integer>(arr.length);
        int n = arr.length;
       
        int final1 = -1, k = 0;
        int start = 0, end = n - 1, mid = 0, target = 2;
        int min=target+1;
        int res=bs(arr,target,start,end,mid,final1);
        
        System.out.println(res);
        //System.out.println(temp);
        
       
    }

     static int bs(int[] arr, int target, int start, int end, int mid, int final1) {
        // TODO Auto-generated method stub
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                final1 = mid;
                return final1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                //temp.add(arr[mid]);
                
                end = mid - 1;
            }
            
        }
        return start;
    }
}
