public class App {
    public static void main(String[] args) throws Exception {
        int[] tester = {2};
        
        System.out.println(removeElement(tester, 3));
        for(int element : tester){
            System.out.print(element + ", ");
        }
    }

    public static int removeElement(int[] nums, int val){
        int pointer = 0;
        int end = nums.length -1 ;

        while(pointer <= end){
            if(nums[pointer] == val){
                pushToEnd(nums, pointer);
                end--;
            }
            else{
                pointer++;
            }
        }
        return pointer;
    }

    public static void pushToEnd(int[] array, int index){
        int temp = array[index];
        for(int i = index; i < array.length - 1; i++){
            array[i] = array[i + 1];
        }
        array[array.length - 1] = temp;
    }
}
