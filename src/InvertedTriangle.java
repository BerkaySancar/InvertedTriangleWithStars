import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for line: ");
        int number = input.nextInt();

        for (int a = number; a >= 1; a--) {
            for (int b = 1; b <= (number - a + 1); b++) {
                System.out.print(" ");
            }
            for (int c = (2 * a) - 1; c >= 1; c--) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }
