public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[0];// Input array
        
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums){
        int insertionIndex = 1;// zero will always be unique

        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] < nums[i+1]){
                nums[insertionIndex] = nums[i+1];
                insertionIndex++;
            }
        }

        return insertionIndex;
    }
}
