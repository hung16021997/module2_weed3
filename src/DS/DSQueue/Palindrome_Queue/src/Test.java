package DS.DSQueue.Palindrome_Queue.src;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome(11);
        palindrome.enqueue('A');
        palindrome.enqueue('b');
        palindrome.enqueue('l');
        palindrome.enqueue('e');
        palindrome.enqueue('w');
        palindrome.enqueue('a');
        palindrome.enqueue('s');
        palindrome.enqueue('I');
        palindrome.enqueue('e');
        palindrome.enqueue('r');
        palindrome.enqueue('e');
        palindrome.enqueue('I');
        palindrome.enqueue('s');
        palindrome.enqueue('a');
        palindrome.enqueue('w');
        palindrome.enqueue('e');
        palindrome.enqueue('l');
        palindrome.enqueue('b');
        palindrome.enqueue('A');
        System.out.println(palindrome.isPalindrome());
        System.out.println(Arrays.toString(palindrome.getArray()));
    }
}
