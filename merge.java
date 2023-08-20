import java.util.*;

public class merge {
    static void Merge(int array[], int lb, int mid, int ub) {
        int len = mid - lb + 1;
        int len2 = ub - mid;
        int low[] = new int[len], high[] = new int[len2], a = 0, b = 0, i = 0;
        int k = lb;
        for (int j = 0; j < len; j++) {
            low[j] = array[k++];
        }
        k = mid + 1;
        for (int j = 0; j < len2; j++) {
            high[j] = array[k++];
        }
        k=lb;
        while (a < len && b < len2) {
            if (low[a] <= high[b]) {
                array[k++] = low[a++];

            } else {
                array[k++] = high[b++];

            }

        }
        while (a < len) {
            array[k++] = low[a++];
        }
        while (b < len2) {
            array[k++] = high[b++];
        }
    }

    static void MergeSort(int arr[], int LowerBound, int UpperBound) {
        if (LowerBound < UpperBound) {
            int mid = (LowerBound + UpperBound) / 2;
            MergeSort(arr, LowerBound, mid);
            MergeSort(arr, mid + 1, UpperBound);
            Merge(arr, LowerBound, mid, UpperBound);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter he elements of the array :");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        MergeSort(array, 0, n - 1);
        System.out.println("The sorted elements of the array :");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
