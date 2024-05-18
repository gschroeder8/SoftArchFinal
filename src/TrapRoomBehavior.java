public class TrapRoomBehavior extends RoomBehavior {
    public void interact(Player player) {
        System.out.println("You were attacked by an old trap that was never set off and lost 20 health points!");
        player.decreaseHealth(20);
        printPlayerStatus(player);
    }

    public String getDescription() {
        return "This is one of the middle rooms, it has a very eerie feeling.";
    }
}
