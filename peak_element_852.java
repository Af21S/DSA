public class peak_element_852 {
    public static void main(String[] args) {
        int nums[]={0,1,0};
        int n=nums.length;
        int peak=0,start=0,end=n-1,mid=0;
        while(start<end){
            mid=nums[start+(end-start)]/2;
            if(mid<peak){
                start=mid+1;
                System.out.println("Start: "+start);
            }
            if(mid>peak){
                peak=mid;
                end=mid-1;
                System.out.println(peak);
            }

        }
        System.out.println(peak);
    }
}
