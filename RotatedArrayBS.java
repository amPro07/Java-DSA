public class RotatedArrayBS {
    public static void main(String[] args) {
        int nums[] = {50,70,90,120,15,26,30,40};
        int min = findSmallest(nums);
        int target =15;
        int pos;
        if(nums[min] <= target  && target<= nums[nums.length-1]){
            pos = BinarySearch(nums, min, nums.length-1, target);
        }else{
            pos = BinarySearch(nums, 0, min, target);
        }
        System.out.println(pos);
    }

    private static int BinarySearch(int[] nums, int min, int i, int target) {
        int left = min;
        int right = i;
        while(left<=right){
            int mid= (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                left = mid+1;
            }else{
                right= mid-1;
            }
        }
        return -1;
    }

    private static int findSmallest(int[] nums) {
        int left = 0; 
        int right = nums.length-1;
        while(left < right){
            int mid =  (right + left)/2; 
            if( mid >0 &&  nums[mid] < nums[mid-1] && nums[mid]< nums[mid+1]){ 
                return mid; 
            } 
            else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){
                 left = mid+1; 
                } else{
                     right = mid-1; }
                     } 
                     return left; }
    
}
