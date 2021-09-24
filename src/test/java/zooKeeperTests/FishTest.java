package zooKeeperTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zooKeeper.Fish;
import zooKeeper.CatFish;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FishTest {

    @Test
    @DisplayName("Tests the breathe method for Fish")
    public void breatheTest() {
        Fish testFish = new CatFish();
        assertEquals("Blub blub, I breathe under the water using gills", testFish.breathe(), "Incorrect return");
    }

}
