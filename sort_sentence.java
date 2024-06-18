import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class sort_sentence {
    public static void main(String[] args) {
        //is2 sentence4 This1 a3
        String str="is2 sentence4 This1 a3";
        String res="";
        char mark=' ';
        ArrayList<Integer> nums = new ArrayList(2);
        String [] l_str=str.split(" ");
        ArrayList<String>strr= new ArrayList<>(Collections.nCopies(l_str.length, ""));
        
        for (String string : l_str) {
            //System.out.println(string);
            int len =string.length();
            mark=string.charAt(len-1);
           int in=Character.getNumericValue(mark);
            //System.out.println(mark);
            nums.add(in);
            strr.set(in-1,string.substring(0, len-1));

           
        }
        //str.indexOf(i).endsWith(s)
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
        int k=0;
        
    for (String iterable_element : strr) {
         res+=iterable_element+" ";
    }
            
     System.out.println(res);

        

        // k++;
        //     String s=Integer.toString(k);
        //     if(l_str[i].endsWith(s)){
        //         System.out.println(l_str[i]);
        //     }
    }
    
}
