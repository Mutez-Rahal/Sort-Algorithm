
package sort_algorithm;

import java.util.Arrays;

public class InsertionSort {

    int A[] = {5, 55, 9, 4, 7, 23, 52, -3, 14};
    
    void insertionSort(){
        int gecici, j;
        for (int i = 1; i < A.length; i++) {
            gecici = A[i];
            j = i;
            
            while(j > 0 && A[j-1] > gecici){
                A[j] = A[j-1];
                --j;
            }
            A[j] = gecici;
        }
    }
    
    public static void main(String[] args) {
        InsertionSort i = new InsertionSort();
        System.out.println("Sıralanmamış dizinin hali : " + Arrays.toString(i.A));
        i.insertionSort();
        System.out.println("Dizinin Sıaralanmış hali : " + Arrays.toString(i.A));
    }
    
}
