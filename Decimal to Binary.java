import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> binaryNum = new ArrayDeque<>();

        do {
            binaryNum.push( num % 2);
            num /= 2;
        } while (num != 0);
        while (!binaryNum.isEmpty())
            System.out.print(binaryNum.pop());
    }
}