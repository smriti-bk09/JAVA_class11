

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerManager {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        boolean choice = true;

        while (choice) {

            System.out.print("Enter player name: ");
            String name = input.nextLine();

            System.out.print("Enter player score: ");
            int score = input.nextInt();
            
            input.nextLine(); 

            playerList.add(new Player(name, score));

            System.out.print("Do you want to add more players? (y/n): ");
            char c = input.next().charAt(0);
            input.nextLine(); 

            if (c == 'n' || c == 'N') {
                choice = false;
            }
        }

        System.out.println("\nPlayer List:");
        for (Player player : playerList) {
            System.out.println(player);
        }

        input.close();
    }
}