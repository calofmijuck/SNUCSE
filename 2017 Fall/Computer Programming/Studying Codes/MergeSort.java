import java.util.Arrays;

public class MergeSort {
    public static int[] MergeSort(int[] arr) {
        int[] sort = new int[arr.length];
        int n = arr.length;
        if(n <= 1) {
            return arr;
        }
        else {
            int[] arr1 = MergeSort(Arrays.copyOfRange(arr, 0, n/2));
            int[] arr2 = MergeSort(Arrays.copyOfRange(arr, n/2, n));
            int i = 0, j = 0, k = 0;
            while (i < arr1.length && j < arr2.length) {
                if(arr1[i] <= arr2[j]) {
                    sort[k] = arr1[i];
                    i++;
                } else {
                    sort[k] = arr2[j];
                    j++;
                }
                k++;
            }
            while(i < arr1.length) {
                sort[k] = arr1[i];
                i++; k++;
            }
            while(j < arr2.length) {
                sort[k] = arr2[j];
                j++; k++;
            }
            return sort;
        }
    }
}
