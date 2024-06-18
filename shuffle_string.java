import java.util.ArrayList;

import java.util.Collections;

public class shuffle_string {
    public static void main(String[] args) {
        // s = "codeleet", indices = [4,5,6,7,0,2,1,3
        String s= "codeleet";
        int [] indices={4,5,6,7,0,2,1,3};
        ArrayList<String> str = new ArrayList<>(Collections.nCopies(s.length()," "));
        for(int i=0;i<indices.length;i++){
            String temp=Character.toString(s.charAt(i));
            str.set(indices[i],temp);
        }
        System.out.println(str);
    }
    
}
