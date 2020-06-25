import java.util.Arrays;

public class DemoSort {
    public static void bubbleSort(int[]arr,int n) {
        for (int i=0;i<n-1;i++) {
            for (int j=n-1;j>i;j--) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] listNumber = {25,10,-5,99,-100};
        bubbleSort(listNumber,5);
        System.out.println(Arrays.toString(listNumber));
    }
}
