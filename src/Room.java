public class Room {
    private RoomBehavior behavior;
    private boolean interacted;

    public Room(RoomBehavior behavior) {
        this.behavior = behavior;
        this.interacted = false;
    }

    public void interact(Player player) {
        if (!interacted) {
            behavior.interact(player);
            interacted = true;
        } else {
            System.out.println("You have already interacted with this room.");
        }
    }

    public String getDescription() {
        return behavior.getDescription();
    }

    public RoomBehavior getBehavior() {
        return behavior;
    }
}
