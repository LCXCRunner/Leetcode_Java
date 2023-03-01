import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] test = new int[]{1, 5, 7, 8, 10};
        System.out.println(Arrays.toString(twoSum(test, 18)));

    }

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        int length = nums.length;
        for(int i = 0; i < length; i++){
            if(i != length - 1){
                for(int j = i + 1; j < length; j++){
                    if(nums[i] + nums[j] == target){
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
