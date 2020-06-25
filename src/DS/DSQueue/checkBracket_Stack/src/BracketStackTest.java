package DS.DSQueue.checkBracket_Stack.src;

public class BracketStackTest {
    public static void main(String[] args) {
        BracketStack bracketStack1 = new BracketStack(15);
        BracketStack bracketStack2 = new BracketStack(15);
        BracketStack bracketStack3 = new BracketStack(15);
        BracketStack bracketStack4 = new BracketStack(15);
        String expression1 = "s * (s – a) * (s – b) * (s – c)";
        String expression2 = "s * (s – a) * (s – b * (s – c)";
        String expression3 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        String expression4 = "s * (s – a) * s – b) * (s – c)";
        char[] array1 = expression1.toCharArray();
        char[] array2 = expression2.toCharArray();
        char[] array3 = expression3.toCharArray();
        char[] array4 = expression4.toCharArray();
        bracketStack1.pushArray(array1);
        bracketStack2.pushArray(array2);
        bracketStack3.pushArray(array3);
        bracketStack4.pushArray(array4);
        System.out.println(bracketStack1.checkSymbol());
        System.out.println(bracketStack2.checkSymbol());
        System.out.println(bracketStack3.checkSymbol());
        System.out.println(bracketStack4.checkSymbol());
    }
}
