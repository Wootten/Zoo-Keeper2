package zooKeeperTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zooKeeper.Pigeon;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PigeonTest {

    ////////// Pigeon Tests //////////
    @Test
    @DisplayName("Tests Pigeon Constructor with no parameters")
    void noParameterConstructorTest () {
        Pigeon testPigeon = new Pigeon();
        assertEquals(75, testPigeon.getEnergy(), "Returned wrong energy");
    }

    @Test
    @DisplayName("Tests Pigeon Constructor with all parameters")
    void allParameterConstructorTest () {
        Pigeon testPigeon = new Pigeon(70);
        assertEquals(70, testPigeon.getEnergy(), "Returned wrong energy");
    }

    @Test
    @DisplayName("Tests energy getter and setter methods")
    void energyGetterSetterTest () {
        Pigeon testPigeon = new Pigeon(60);
        testPigeon.setEnergy(70);
        assertEquals(70, testPigeon.getEnergy(), "Unexpected energy returned");
    }

    @Test
    @DisplayName("Checks if the pigeon's energy levels increase when it eats")
    void pigeonEnergyTest() {
        Pigeon testPigeon = new Pigeon(30);
        testPigeon.eat();
        assertEquals(31, testPigeon.getEnergy(), "Energy levels were incorrect");
    }

}
