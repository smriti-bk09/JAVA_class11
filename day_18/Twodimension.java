
import java.util.Scanner;

public class Twodimension {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[][] n = new String[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                n[i][j] = input.nextLine();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }
}

