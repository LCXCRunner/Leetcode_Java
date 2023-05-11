public class App {
    public static void main(String[] args) throws Exception {
        int[] array1 = {1,5,9};
        int[] array2 = {0,7,12,15,75,90,120};
        int[] result = merge(array1, array2);

        System.out.println(result.length);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();

        System.out.println(findMedianSortedArrays(array1, array2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] result = merge(nums1, nums2);
        int length = result.length;

        if(length%2 != 0){// if odd then there is just a single median
            return result[length / 2];
        }
        else{// if even then there is the average of two medians
            return (double)(result[length / 2 - 1] + result[length / 2]) / 2;
        }
    }

    public static int[] merge(int[] array1, int[] array2){
        int m = array1.length;
        int n = array2.length;
        int[] merged = new int[m+n];
        int indexArray1 = 0;
        int indexArray2 = 0;

        for(int i = 0; i < merged.length; i++){
            if(m > indexArray1 && n > indexArray2)// check if each array has digets left
                if(array1[indexArray1] < array2[indexArray2]){
                    merged[i] = array1[indexArray1];
                    indexArray1++;
                }
                else{
                    merged[i] = array2[indexArray2];
                    indexArray2++;
                }
            else if(m == indexArray1){// if array1 is empty then just add the rest of array2
                merged[i] = array2[indexArray2];
                indexArray2++;
            }
            else{// if array2 is empty then just add the rest of array1
                merged[i] = array1[indexArray1];
                indexArray1++;
            }
        }

        return merged;
    }
}
