package Strategy;

public class SelectionSort implements Sorter{

    private int[] arr;

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }
    // Source code https://www.geeksforgeeks.org/selection-sort-algorithm-2/
    @Override
    public void sort() {
        int n = this.arr.length;
        for (int i = 0; i < n - 1; i++) {

            // Assume the current position holds
            // the minimum element
            int min_idx = i;

            // Iterate through the unsorted portion
            // to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {

                    // Update min_idx if a smaller element
                    // is found
                    min_idx = j;
                }
            }

            // Move minimum element to its
            // correct position
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
}
