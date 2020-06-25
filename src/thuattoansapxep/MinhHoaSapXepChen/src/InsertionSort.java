package thuattoansapxep.MinhHoaSapXepChen.src;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter "+list.length+" values: ");
        for (int i=0; i<list.length;i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int values : list) {
            System.out.println(values+"\t");
        }
        System.out.println("\nBắt đầu xử lý sắp xếp");
        arrangeInsertionByStep(list);
    }
    public static void arrangeInsertionByStep(int[] arr) {
        boolean needNextPass = true;
        for (int i=1;i<arr.length;i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
            System.out.print("Array after the "+i+" sort: ");
            for (int value : arr) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
