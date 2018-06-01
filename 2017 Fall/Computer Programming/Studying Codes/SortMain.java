public class SortMain {
    public static void main(String[] args){
        int[] arr1 = {3, 5, 4, 2, 4, 7, 5, 3, 10, 5, 7, 3, 8};
        int[] arr = MergeSort.MergeSort(arr1);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
