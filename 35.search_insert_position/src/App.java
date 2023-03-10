public class App {
    public static void main(String[] args) throws Exception {
        int[] tester = {1, 4, 5, 7, 8};
        System.out.println(searchInsert(tester, 2));
    }

    public static int searchInsert(int[] nums, int target){
        int first = 0;
        int last = nums.length -1;
        int mid = (first+last)/2;

        while(first<=last){
            if(nums[mid] < target){
                first = mid + 1;
            }
            else if(nums[mid] == target){
                return mid;
            }
            else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if(first > last){
            if(target < nums[0]){
                return mid;
            }
            else{
                return mid + 1;
            }
        }
        return -1;
    }
}
