public class App {
    public static void main(String[] args) throws Exception {
        int[] test1 = new int[5];
        test1[0] = 1;
        test1[1] = 3;
        test1[2] = 5;
        test1[3] = 7;
        test1[4] = 9;
        int[] test2 = new int[0];

        merge(test1, 5, test2, 0);

        for(int i = 0; i < test1.length; i++){
            System.out.print(test1[i] + ", ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int[] temp = new int[m+n];
        int x = 0;
        int y = 0;

        for(int i = 0; i < m + n; i++){
            if(x != m && y != n){
                if(nums1[x] <= nums2[y]){
                    temp[i] = nums1[x];
                    x++;
                }
                else if(nums2[y] <= nums1[x]){
                    temp[i] = nums2[y];
                    y++;
                }
            }
            else if(x == m){
                temp[i] = nums2[y];
                y++;
            }
            else{
                temp[i] = nums1[x];
                x++;
            }
        }
        for(int j = 0; j < m+n; j++){
            nums1[j] = temp[j];
        }
    }
    /*
     * ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode preMergedHead = new ListNode(-1);
        ListNode pointer = preMergedHead;

        while(curr1 != null && curr2 != null){
            if(curr1.val <= curr2.val){
                pointer.next = curr1;
                pointer = pointer.next;
                //System.out.println(pointer.val);
                curr1 = curr1.next;
            }
            else{
                pointer.next = curr2;
                pointer = pointer.next;
                //System.out.println(pointer.val);
                curr2 = curr2.next;
        }
    }

        while(curr1 != null){
            pointer.next = curr1;
            pointer = pointer.next;
            curr1 = curr1.next;
            //System.out.println(pointer.val);
        }

        while(curr2 != null){
            pointer.next = curr2;
            pointer = pointer.next;
            curr2 = curr2.next;
            //System.out.println(pointer.val);
        }
        return preMergedHead.next;
     */
}
