package Project;

import Project.Locations.GameMap;
import Project.Locations.Direction;
import java.util.Scanner;

public class Game {
    private Player player;
    private GameMap gameMap;

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String playerName = scanner.nextLine().trim();

        // inicjalizacja game mapy
        gameMap = new GameMap();

        // inicjalizacja playera
        player = new Player(playerName, gameMap);

        System.out.println("Welcome to the Adventure Game, " + playerName + "! Type 'help' for a list of commands.");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("help")) {
                printHelp();
            } else if (input.equals("look")) {
                player.look();
            } else if (input.startsWith("move ")) {
                String dir = input.substring(5).toUpperCase();
                try {
                    Direction direction = Direction.valueOf(dir);
                    player.move(direction);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid direction. Try: north, south, east, west.");
                }
            } else if (input.startsWith("pickup ")) {
                String itemName = input.substring(7).trim();
                player.pickup(itemName);
            } else if (input.equals("inventory")) {
                player.describeInventory();
            } else if (input.startsWith("use ")) {
                String itemName = input.substring(4).trim();
                player.useItem(itemName);
            } else if (input.equals("quit")) {
                System.out.println("Thanks for playing!");
                break;
            } else {
                System.out.println("Unknown command. Type 'help' to see available commands.");
            }
        }
        scanner.close();
    }

    private void printHelp() {
        System.out.println("Available commands:");
        System.out.println("- look: describe your current location in the game;");
        System.out.println("- inventory: show your inventory;");
        System.out.println("- use <item>: use an item from your inventory;");
        System.out.println("- move <direction>: move north, south, east, west;");
        System.out.println("- pickup <item>: pick up an item in the location;");
        System.out.println("- quit: exit the game");
    }
}
