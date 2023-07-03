package sort_algorithm;

import java.util.Arrays;

public class QuickSort {

    static int A[] = {1, 88, 90, 44, 74};

    int parcala(int[] A, int bas, int son) {
         // pivot
        int pivot = A[son];

        int i = (bas - 1);
  
        for (int j = bas; j <= son - 1; j++) {

            if (A[j] < pivot) {

                i++;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, son);
        return (i + 1);
    
    }
    
     static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void yerDegistir(int[] A, int bir, int iki) {
        int gecici = A[bir];
        A[bir] = A[iki];
        A[iki] = gecici;
    }

    void quickSort(int[] A, int bas, int son) {
        int pivot;
        if (bas < son) {
            pivot = parcala(A, bas, son);
            quickSort(A, bas, pivot - 1);
            quickSort(A, pivot + 1, son);
        }
    }

    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        System.out.println("Sıralanmamış dizinin hali : " + Arrays.toString(q.A));
        q.quickSort(A, 0, A.length - 1);
        System.out.println("Dizinin Sıaralanmış hali : " + Arrays.toString(q.A));
    }

}
