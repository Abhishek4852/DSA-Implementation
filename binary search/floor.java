public class floor {
    public static void main(String[] args) {
        int [] arr ={1, 2, 8, 10, 10, 12,19 ,25};
        
        System.out.println(findFloor(arr,26));
    }
    static int findFloor(int[] arr, int x) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
    
        while (s <= e) {
            int mid = s + (e - s) / 2;
    
            if (arr[mid] == x) {
                return mid;  // exact match is the floor
            } else if (arr[mid] < x) {
                ans = mid;   // potential floor found
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
    
        return ans;  // if x is smaller than all, ans will be -1
    }
}
