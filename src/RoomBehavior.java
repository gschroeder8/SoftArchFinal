public abstract class RoomBehavior {
    public abstract void interact(Player player);
    public abstract String getDescription();

    public static void printPlayerStatus(Player player) {
        System.out.println("Player's health: " + player.getHealth());
        System.out.println("Player's gold: " + player.getGold());
        System.out.println("Player's inventory: " + player.getInventory());
    }
}
