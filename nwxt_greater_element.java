import java.util.ArrayList;
import java.util.Collections;

public class nwxt_greater_element {
    public static void main(String[] args) {
        int n=21;
        int n1=n;
        ArrayList<Integer> list = new ArrayList<>(2);
        while (n > 0) {
            list.add(n % 10);
            n = n / 10;
        }
        Collections.sort(list,Collections.reverseOrder());
        int num=0;
        for(int i=0;i<list.size();i++){
            num=num*10+list.get(i);
        }
        if(num>n1){
            System.out.println(num);
        }
        else{
            System.out.println(-1);
        }
      
    }
    
}
