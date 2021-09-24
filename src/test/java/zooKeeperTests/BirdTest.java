package zooKeeperTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zooKeeper.Bird;
import zooKeeper.Pigeon;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirdTest {

    @Test
    @DisplayName("Tests the breathe method for birds")
    public void breatheTest() {
        Bird testBird = new Pigeon();
        assertEquals("Inhale(with my beak)... exhale(with my beak)", testBird.breathe(), "Incorrect return");
    }
}
