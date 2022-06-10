import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        ArrayDeque<Integer> indexes = new ArrayDeque<>();
        for (int index = 0; index < expression.length(); index++) {
            if(expression.charAt(index) == '(') {
                indexes.push(index);
            } else if(expression.charAt(index) == ')') {
                int startIndex = indexes.pop();
                String contents = expression.substring(startIndex, index + 1);
                System.out.println(contents);
            }
        }
    }
}