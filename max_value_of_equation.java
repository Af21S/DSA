public class max_value_of_equation {
    public static void main(String[] args) {
        //points = [[1,3],[2,0],[5,10],[6,-10]], k = 1
        int [][] arr={{-19,9},{-15,-19},{-5,-8}};
        int num=1;
        long max=Integer.min(0, 1);
       // System.out.println(max);
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length;j++){
                int k=i+1;
                while(k<arr.length){
                    int x1=arr[i][0],x2=arr[k][0],y1=arr[i][1],y2=arr[k][1];
                    int r=y1+y2+Math.abs(x2-x1);
                    if(x1<x2 && max<r &&Math.abs(x2-x1)<=num){
                        
                        
                        max=r;
                        
                    }
                    k++;
                }
            }
        }


        System.out.println(max);
    }
}
