import java.util.ArrayList;

public class concatarr {
    public static void main(String[] args) {
        // int[] list={1,2,1};

        // ArrayList<Integer> ans = new ArrayList<>(list.length);
        // for(int i=0;i<2;i++){
        //     for (int iterable_element : list) {
        //         ans.add(iterable_element);
                
        //     }
        // }

        
        // //Object [] ans1 = new Object[2*list.length];
        // int[] ans1 = new int[ans.size()];
        // for (int i=0;i<ans.size();i++) {
        //     ans1[i]=ans.get(i).intValue();
        //     System.out.println(ans1[i]);

            
        // }
        //int arr[]={1,2,3,4};
        // 

        // int [][] accounts = {{1,2},{3,4},{5,6}};
//         int max=0;
//         for(int i=0;i<accounts.length;i++){
//             int sum=0;
//             for(int j=0;j<accounts[i].length;j++){
//             sum=sum+accounts[i][j];}

//             if(max<sum){
//                 max=sum;
//             }

//         }


        


// System.out.println(max);


   int candies [] = {2,3,5,1,3};
//     int n=3;
//    int arr1[] = new int[arr.length];
//    int count=0;
//    for(int i=0;i<arr.length;i++){
//     if(i%2==0){arr1[i]=arr[count]; System.out.println(arr1[i]);count++;}
//     else{arr1[i]=arr[n]; n=n+1; System.out.println(arr1[i]);}
//    }
    // boolean arr[] = new boolean[candies.length];
    // int extra=3;
    // int max=0;
    // for (int i=0;i<candies.length;i++) {
    //     if(max<candies[i]){
    //         max=candies[i];
    //     }
    // }
    // for(int i=0;i<candies.length;i++){
    //     if(candies[i]+extra>=max){System.out.println(true);}
        // else{System.out.println(false);}



        // int[] arr={1,1,1,1};
        // int count=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]==arr[j] && i<j){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);
    
        // 
        



                int [][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
                int m = 3, n = 3;
                int count = 0;
                int visited[] = new int[m * n]; 
                int top = 0, bottom = matrix.length - 1, right = matrix[0].length - 1, left = 0;
        
                while (top <= bottom && left <= right) {
                    // Traverse from left to right along the top row
                    for (int j = left; j <= right; j++) {
                        visited[count] = matrix[top][j];
                        System.out.println(visited[count]);
                        count++;
                    }
                    top++;
        
                    // Traverse from top to bottom along the right column
                    for (int i = top; i <= bottom; i++) {
                        visited[count] = matrix[i][right];
                        System.out.println(visited[count]);
                        count++;
                    }
                    right--;
        
                    // Check if there's still a row to traverse from right to left
                    if (top <= bottom) {
                        for (int j = right; j >= left; j--) {
                            visited[count] = matrix[bottom][j];
                            System.out.println(visited[count]);
                            count++;
                        }
                        bottom--;
                    }
        
                    // Check if there's still a column to traverse from bottom to top
                    if (left <= right) {
                        for (int i = bottom; i >= top; i--) {
                            visited[count] = matrix[i][left];
                            System.out.println(visited[count]);
                            count++;
                        }
                        left++;
                    }
                }
        
                System.out.println("Spiral Order:");
                for (int i = 0; i < visited.length; i++) {
                    System.out.print(visited[i] + " ");
                }
            }
        }
        
    
  
