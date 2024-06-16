public class spiral_matrix {
    public static void main(String[] args) {
        int [][] matrix ={{1,2,3,9},
                          {4,5,6,2},
                          {7,8,9,12}};
        int m=4,n=4;
        int count=0;
        int visited[] = new int[m*n]; 
        int top=0,bottom=matrix.length-1,right=matrix[0].length-1,left=0;
        
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                visited[count]=matrix[top][j];
              System.out.println(visited[count]);
              count++;
            }
            top++;

            for(int i=top;i<=bottom;i++){
                visited[count]=matrix[i][right];
                System.out.println(visited[count]);
                count++;
            }
            right--;

            
            
            for(int k=right;k>=left;k--){
                visited[count]=matrix[bottom][k];
                System.out.println(visited[count]);
                count++;
            }
            bottom--;

            for(int l=bottom;l>=top;l--){
                visited [count]=matrix[l][left];
                System.out.println(visited[count]);
                count++;
            }
            left ++;

            if(left==right && top==bottom){
                //visited[count]=matrix[left][right];
                break;
            }

        }
        //left--;

        for(int i=0;i<visited.length;i++){
            System.out.println(visited[i]);
        }
        

        
    }
}




// while(top<=bottom && left<=right){
//     for(int j=left;j<=right;j++){
//         visited.add(matrix[top][j]);
//       //System.out.println(visited[count]);
//       //count++;
//     }
//     top++;

//     if(left<=right){
//     for(int i=top;i<=bottom;i++){
//         visited.add(matrix[i][right]);
//       //  System.out.println(visited[count]);
//        // count++;
//     }
//     right--;}

//     if(top<=bottom){
    
//     for(int k=right;k>=left;k--){
//         visited.add(matrix[bottom][k]);
//        // System.out.println(visited[count]);
//        // count++;
//     }
//     bottom--;}

//     if(left<=right){

//     for(int l=bottom;l>=top;l--){
//         visited.add(matrix[l][left]);
//         //System.out.println(visited[count]);
//        // count++;
//     }
//     left ++;}

// }