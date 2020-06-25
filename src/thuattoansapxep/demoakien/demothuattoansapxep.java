package thuattoansapxep.demoakien;

import java.util.Arrays;

public class demothuattoansapxep {
    public static void main(String[] args) {
        int[] arr = {1,2,6,21,3,4,8};
//        buddle(arr);
//        selection(arr);
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
//
//    static  void buddle(int[] arr){
//        boolean isCheck= true;
//        for (int i = 1; i < arr.length && isCheck; i++){
//            isCheck = false;
//            for (int j = 0; j < arr.length - i; j++){
//                if (arr[j + 1] < arr[j]){
//                    swap(arr, j ,j + 1);
//                    isCheck = true;
//                }
//            }
//        }
//    }

    private static void swap(int[] arr, int j, int i) {
        int tempt = arr[i];
        arr[i] = arr[j];
        arr[j] = tempt;
    }
//    static void selection(int[] arr){
//
//for (int i = 1; i < arr.length; i ++){
//    for (int j = i + 1; j < arr.length; j++){
//     if (arr[i] > arr[j]){
//         swap(arr,i,j);
//     }
//    }
//}
//    }

    static  void insertion(int[] arr){
        int index;
        for (int i = 1;i < arr.length; i++){
            index = arr[i];
            for (int j = i - 1; j > 0 && arr[j] > index; j--){
                arr[j+1] = arr[j];
                arr[j] = index;
            }
        }
    }
}