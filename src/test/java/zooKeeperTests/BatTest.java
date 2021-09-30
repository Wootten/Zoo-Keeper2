package zooKeeperTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zooKeeper.Bat;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BatTest {
    ////////// Bat Tests //////////
    @Test
    @DisplayName("Checks to see if the bat eats because it is night time")
    void batEatsNight() {
        Bat testBat = new Bat(true);
        assertEquals("Eating because it's night time", testBat.eat(),"Was not true");
    }

    @Test
    @DisplayName("Checks to see if the bat will not eat because it is day time")
    void batEatsDay() {
        Bat testBat = new Bat(false);
        assertEquals("It is day time so I am sleeping", testBat.eat(),"Was not false");
    }

    @Test
    @DisplayName("Tests day/night getter and setter methods")
    void dayNightGetterSetterTest() {
        Bat testBat = new Bat(true);
        testBat.setNightTime(false);
        assertEquals(false, testBat.isNightTime(), "Returned true (expected false)");
    }

    @Test
    @DisplayName("Constructor Check on no parameters")
    void noParameterConstructorTest () {
        Bat testBat = new Bat();
        assertEquals(true, testBat.isNightTime(), "Returned false instead of true");
    }

    @Test
    @DisplayName("Constructor Check with parameters")
    void booleanParameterConstructorTest () {
        Bat testBat = new Bat(true);
        assertEquals(true, testBat.isNightTime(), "Returned false instead of true");
    }

}
