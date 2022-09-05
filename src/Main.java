import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        System.out.println("Enter a number: ");
        Scanner numberInput = new Scanner(System.in);
        number = Integer.parseInt(numberInput.nextLine());

        for (int i = 0; i < 11; i++) {
            int answer = i * number;
            System.out.println(i + " x " + number + " = " + answer);
        }
    }
}
