package sort_algorithm;

import java.util.Arrays;

public class BubbleSort {

    int A[] = {1, 8, 9, 4, 7, 2, 5, 3, 7};

    void bublleSort() {
        boolean devam = true;
        while (devam) {
            devam = false;
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] > A[i + 1]) {
                    yerDegistir(i, i + 1);
                    devam = true;
                }
            }
        }
    }

    void yerDegistir(int bir, int iki) {
        int gecici = A[bir];
        A[bir] = A[iki];
        A[iki] = gecici;
    }

    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        System.out.println("Sıralanmamış dizinin hali : " + Arrays.toString(b.A));
        b.bublleSort();
        System.out.println("Dizinin Sıaralanmış hali : " + Arrays.toString(b.A));
    }

}
