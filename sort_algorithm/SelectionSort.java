package sort_algorithm;

import java.util.Arrays;

public class SelectionSort {

    int A[] = {1, 8, 45, 4, 7, 22, 5, 3, 12};

    void selectionSort() {
        int min;
        for (int i = 0; i < A.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }
            yerDegistir(i, min);
        }

    }

    void yerDegistir(int bir, int iki) {
        int gecici = A[bir];
        A[bir] = A[iki];
        A[iki] = gecici;
    }

    public static void main(String[] args) {
        
        SelectionSort s = new SelectionSort();
        System.out.println("Sıralanmamış dizinin hali : " + Arrays.toString(s.A));
        s.selectionSort();
        System.out.println("Dizinin Sıaralanmış hali : " + Arrays.toString(s.A));
    }
}
