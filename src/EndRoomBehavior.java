public class EndRoomBehavior extends RoomBehavior {
    public void interact(Player player) {
        System.out.println("You look around the room and find a pile gold coins on the floor!");
        player.increaseGold(10);
        printPlayerStatus(player);
    }

    public String getDescription() {
        return "This is the end room in the dungeon, It looks new and beautiful.";
    }
}
