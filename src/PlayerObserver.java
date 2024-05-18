import java.util.List;

public interface PlayerObserver {
    void onHealthChange(int newHealth);
    void onGoldChange(int newGold);
    void onInventoryChange(List<String> newInventory);
}