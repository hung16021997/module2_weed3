package thuattoansapxep.thThuatToanSapXepChen.src;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[]arr) {
        for (int i=1;i<arr.length;i++) {
            int Index = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>Index) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = Index;
        }
    }

    public static void main(String[] args) {
        int[] array = {12,11,13,5,6,9,1};
        System.out.println("Truoc khi sap xep: "+ Arrays.toString(array));
        insertionSort(array);
        System.out.println("Sau khi sap xep: "+Arrays.toString(array));
    }
}
