//Реализовать алгоритм сортировки вставками

public class program2 {
    public static void main(String[] args) {
        int[] arr = {14, 11, 7, 2, 15, 10, 19, 5, 4, 6};
        view_arr(arr);

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j-1]>arr[j]; j--) {
                swap(arr, j-1, j);   
            }
        }

        view_arr(arr);
    }

    static void swap (int arr[],int i_a, int i_b) {
        int temp = arr [i_a];
        arr [i_a] = arr [i_b];
        arr [i_b] = temp;
    }
    
    static void view_arr (int arr[]) {
        for (int item : arr) {
            System.out.printf("%d, ", item);
        }
        System.out.println();
    }
}
