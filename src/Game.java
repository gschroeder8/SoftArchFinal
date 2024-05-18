import java.util.ArrayList;
import java.util.List;

public class Game {
    private static Game instance = null;
    private Player player;
    private List<Room> rooms;
    private int currentRoomIndex;

    private Game() {
        player = new Player();
        rooms = new ArrayList<>();
        rooms.add(new Room(new StartRoomBehavior()));
        rooms.add(new Room(new NormalRoomBehavior()));
        rooms.add(new Room(new TrapRoomBehavior()));
        rooms.add(new Room(new EndRoomBehavior()));
        currentRoomIndex = 0;
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void interact() {
        rooms.get(currentRoomIndex).interact(player);
    }

    public boolean moveNextRoom() {
        if (currentRoomIndex < rooms.size() - 1) {
            currentRoomIndex++;
            return true;
        }
        return false;
    }

    public boolean movePreviousRoom() {
        if (currentRoomIndex > 0) {
            currentRoomIndex--;
            return true;
        }
        return false;
    }

    public Player getPlayer() {
        return player;
    }

    public Room getCurrentRoom() {
        return rooms.get(currentRoomIndex);
    }

    public void exitDungeon() {
        System.out.println("Congratulations, you finished the dungeon with:");
        Player.getStatus();
    }
}