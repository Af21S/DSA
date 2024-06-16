import java.util.Arrays;

public class plus_one {
   public static void main(String[] args) {
   int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
      int [] res=new int[arr.length];
   int i=0;
   long sum=0;
   while(i<arr.length){
    sum=sum*10+arr[i];
    i++;
   }
   String dum=Long.toString(sum);
  // Integer arr2=Integer.parseInt(dum);
   StringBuffer sb = new StringBuffer(dum);
   StringBuffer rev= sb.reverse();
   int j=res.length;
   System.out.println();
   for(i=0;i<dum.length();i++){
    res[i]=dum.charAt(i);
   }
   for (i=0;i<res.length;i++) {
    System.out.println(res[i]);
    
   }
   
       
   }
}
