package zooKeeperTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zooKeeper.Pigeon;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PigeonTest {

    ////////// Pigeon Tests //////////
    @Test
    @DisplayName("Tests Pigeon Constructor with no parameters")
    public void noParameterConstructorTest () {
        Pigeon testPigeon = new Pigeon();
        assertEquals(75, testPigeon.getEnergy(), "Returned wrong energy");
    }

    @Test
    @DisplayName("Tests Pigeon Constructor with all parameters")
    public void allParameterConstructorTest () {
        Pigeon testPigeon = new Pigeon(70);
        assertEquals(70, testPigeon.getEnergy(), "Returned wrong energy");
    }

    @Test
    @DisplayName("Tests energy getter and setter methods")
    public void energyGetterSetterTest () {
        Pigeon testPigeon = new Pigeon(60);
        testPigeon.setEnergy(70);
        assertEquals(70, testPigeon.getEnergy(), "Unexpected energy returned");
    }

    @Test
    @DisplayName("Checks if the pigeon's energy levels increase when it eats")
    public void pigeonEnergyTest() {
        Pigeon testPigeon = new Pigeon(30);
        testPigeon.eat();
        assertEquals(31, testPigeon.getEnergy(), "Energy levels were incorrect");
    }

}
