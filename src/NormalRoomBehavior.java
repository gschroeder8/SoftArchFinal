public class NormalRoomBehavior extends RoomBehavior {
    public void interact(Player player) {
        System.out.println("You find a chest in the corner of the room, you open it and find an old sword!");
        player.addItem("Old Sword");
        printPlayerStatus(player);
    }

    public String getDescription() {
        return "This is one of the middle rooms, it is old and dusty.";
    }
}
