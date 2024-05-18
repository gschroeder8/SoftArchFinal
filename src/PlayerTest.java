import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class PlayerTest {
    //health starts at 30
    @Test
    public void testIncreaseHealth() {
        Player player = new Player();
        player.increaseHealth(10);
        assertEquals(40, player.getHealth());
    }
    //gold starts at 0
    @Test
    public void testIncreaseGold() {
        Player player = new Player();
        player.increaseGold(10);
        assertEquals(10, player.getGold());
    }
    //inventory starts empty
    @Test
    public void testAddItem() {
        Player player = new Player();
        player.addItem("Sword");
        assertEquals("Sword", player.getInventory().get(0));
    }
    @Test
    public void testGetObserverCount() {
        Player player = new Player();
        assertEquals(0, player.getObservers());
    }
}