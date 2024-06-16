import java.util.ArrayList;
import java.util.List;

public class spiral2 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int n=3;
        int [] arr = new int[n*n];
        for(int i=0;i<n*n;i++){
            arr[i]=i;
        }


        List<List<Integer>> matrix2= new ArrayList();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(0); // Initialize with default values
            }
            matrix2.add(row);
        }
         List<Integer> visited = new ArrayList<>();
        int top=0,bottom=matrix.length-1,right=matrix[0].length-1,left=0;
        int count=1,max=n*n;
        while(top<=bottom && left<=right && count<=max){
            for(int j=left;j<=right;j++){
               
                    matrix2.get(top).set(j,count);
                
                count++;
                
              //System.out.println(visited[count]);
              //count++; 
            }
            top++;

            if(left<=right){
            for(int i=top;i<=bottom;i++){
                matrix2.get(i).set(right,count);
              //  System.out.println(visited[count]);
               count++;
            }
            right--;}

            if(top<=bottom){
            
            for(int k=right;k>=left;k--){
                matrix2.get(bottom).set(k,count);
               // System.out.println(visited[count]);
              count++;
            }
            bottom--;}

            if(left<=right){

            for(int l=bottom;l>=top;l--){
                matrix2.get(l).set(left,count);
                //System.out.println(visited[count]);
              count++;
            }
            left ++;}

        }
        //left--;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(matrix2.get(j));
            }
        }
    }
    
}
