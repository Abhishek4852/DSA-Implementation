
public class piviot_in_rotated_sorted_array {
    public static void main(String[] args) {
        int nums [] = {7,8,9,10,11,12,2,3,4,5,6};
        System.out.print(search_piviot(nums, 0));
    }
    public  static int search_piviot(int[] nums, int target) {
        int s = 0;
        int e = nums.length -1;

        while(s <= e){
            int mid = (s+e)/2;

            if(nums[mid] > nums[s]){
                s = mid+1;
            }
            else if(nums[mid] < nums[e]){
                e = mid-1;
            }
            else {
                return mid;
            }
        }

        return -1;

}

}

