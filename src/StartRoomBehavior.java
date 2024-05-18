public class StartRoomBehavior extends RoomBehavior {
    public void interact(Player player) {
        System.out.println("You find a health potion near the door, it gave you 10 health points!");
        player.increaseHealth(10);
        printPlayerStatus(player);
    }

    public String getDescription() {
        return "You are in the start room, It seems welcoming.";
    }
}
