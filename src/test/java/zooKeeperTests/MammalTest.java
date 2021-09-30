package zooKeeperTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zooKeeper.Mammal;
import zooKeeper.Cat;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MammalTest {

    @Test
    @DisplayName("Tests the breathe method for Mammals")
    void breatheTest() {
        Mammal testMammal = new Cat();
        assertEquals("Inhale... exhale", testMammal.breathe(), "Incorrect return");
    }

}
