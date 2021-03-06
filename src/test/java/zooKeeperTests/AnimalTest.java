package zooKeeperTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zooKeeper.Animal;
import zooKeeper.Cat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {

    @Test
    @DisplayName("Tests sleep method")
    void sleepTest () {
        Animal testAnimal = new Cat();
        assertEquals("ZZZ zzz ZZZ zzz", testAnimal.sleep(), "Incorrect return");
    }

    @Test
    @DisplayName("Tests die method")
    void dieTest () {
        Animal testAnimal = new Cat();
        assertEquals("RIP - I am dead", testAnimal.die(), "Incorrect return");
    }

}
