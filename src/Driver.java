import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Game game = Game.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Game Guide:");
        System.out.println("i: Interact with the room");
        System.out.println("f: Move forward to the next room");
        System.out.println("b: Move back to the previous room");
        System.out.println("v: View inventory");
        System.out.println("e: Exit the game (only available in the end room)");
        System.out.println("\nYour health: " + game.getPlayer().getHealth());

        while (true) {
            System.out.println("\n" + game.getCurrentRoom().getDescription());
            if (game.getPlayer().getHealth() <= 0) {
                System.out.println("You lose");
                break;
            }

            System.out.println("Enter command (i, f, b, v, e):");

            String command = scanner.nextLine();

            switch (command) {
                case "i":
                    game.interact();
                    break;
                case "f":
                    if (!game.moveNextRoom()) {
                        System.out.println("No more rooms to move to.");
                    }
                    break;
                case "b":
                    if (!game.movePreviousRoom()) {
                        System.out.println("No more rooms to move back to.");
                    }
                    break;
                case "v":
                    System.out.println("Gold: " + game.getPlayer().getGold());
                    System.out.println("Items: " + game.getPlayer().getInventory());
                    break;
                case "e":
                    if (game.getCurrentRoom().getBehavior() instanceof EndRoomBehavior) {
                        game.exitDungeon();
                        System.out.println("Exiting game...");
                        scanner.close();
                        return;
                    } else {
                        System.out.println("You can only exit from the end room.");
                    }
                    break;
                default:
                    System.out.println("Invalid command. Please enter again.");
            }
        }
    }
}
