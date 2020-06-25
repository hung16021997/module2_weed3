package DS.DSQueue.chuyensangHeNhiPhan.src;

import java.util.Stack;

public class DecimalToBinary {

    public void convertBinary(int number) {
        Stack<Integer> stack = new Stack<>();
        while (number!=0) {
            //thực hiện phép chia hết cho 2
            int surplus = number % 2;
            // thêm số dư vào stack
            stack.push(surplus);
            number = number/2;
        }
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }

    }

    public static void main(String[] args) {
        int decimalNumber = 654321;
        System.out.print("Hệ nhị phân của "+decimalNumber+" là: ");
        new DecimalToBinary().convertBinary(decimalNumber);
    }
}
