package DS.DSQueue.demSoTu.src;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DemSo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi không dấu: ");
        String inputString = scn.nextLine();
        System.out.println(inputString.length());
        int stringSize = inputString.length();
        System.out.println("The String u just type:");
        for(int i=0;i<stringSize;i++){
            System.out.printf("%s",inputString.charAt(i));
        };
        System.out.println();
        System.out.print("Enter the Char u want to find and count: ");
        String character = scn.nextLine();
        char c = character.charAt(0);
        int count =0;
        for(int i=0;i<stringSize;i++){
            if(c == inputString.charAt(i)){
                count++;
            }
        }
        if(count!=0){
            System.out.printf("Have %d char in String.",count);
        }else {
            System.out.println("Have no char in String.");
        }

    }
}
