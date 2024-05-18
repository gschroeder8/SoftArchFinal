import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<PlayerObserver> observers = new ArrayList<>();
    private static int health = 30;
    private static int gold = 0;
    private static List<String> inventory = new ArrayList<>();

    public void increaseHealth(int amount) {
        health += amount;
        notifyHealthChange();
    }

    public void decreaseHealth(int amount) {
        health -= amount;
        notifyHealthChange();
    }

    public void increaseGold(int amount) {
        gold += amount;
        notifyGoldChange();
    }

    public void addItem(String item) {
        inventory.add(item);
        notifyInventoryChange();
    }

    public void addObserver(PlayerObserver observer) {
        observers.add(observer);
    }

    private void notifyHealthChange() {
        for (PlayerObserver observer : observers) {
            observer.onHealthChange(health);
        }
    }

    private void notifyGoldChange() {
        for (PlayerObserver observer : observers) {
            observer.onGoldChange(gold);
        }
    }

    private void notifyInventoryChange() {
        for (PlayerObserver observer : observers) {
            observer.onInventoryChange(new ArrayList<>(inventory));
        }
    }

    public int getObservers() {
        return observers.size();
    }

    public int getHealth() {
        return health;
    }

    public int getGold() {
        return gold;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public static void getStatus() {
        System.out.println("Player's health: " + health);
        System.out.println("Player's gold: " + gold);
        System.out.println("Player's inventory: " + inventory);
    }
}