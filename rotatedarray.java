public class rotatedarray {
    public static void main(String[] args) {
        int nums [] = {9,10,11,12,2,3,4,5,6,7,8};
        System.out.print(search_piviot(nums));
    }
    public  static int search_piviot(int[] nums) {
        int s = 0;
        int e = nums.length -1;

        while(s <= e){
            int mid = (s+e)/2;


            if(mid < e && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > s && nums[mid] < nums[mid-1])
            return mid-1;
            
            if(nums[mid] < nums[s]){
                e = mid-1;
            }
            else if(nums[mid] > nums[e]){
                s = mid+1;
            }
            
        }

        return -1;

}
}
