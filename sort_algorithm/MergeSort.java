package sort_algorithm;

public class MergeSort {

    void mergeSort(int A[], int bas, int son) {
        int pivot;
        if (bas < son) {
            pivot = (bas + son) / 2;
            mergeSort(A, bas, pivot);
            mergeSort(A, pivot + 1, son);
            merge(A, bas, pivot, son);
        }
    }

    void merge(int arr[], int p, int q, int r) {

        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[p + i];
        }
        for (int j = 0; j < n2; j++) {
            M[j] = arr[q + 1 + j];
        }

        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        int[] a = {1, 5, 8, 65, 4, 5, 41, 52, 785, 125};
        m.mergeSort(a, 0, a.length - 1);
        System.out.println("Sorted Array");
        printArray(a);
    }

}
