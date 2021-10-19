package zooKeeperTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zooKeeper.Zoo;

class ZooTest {

    //None of these tests currently do anything

    ////////// Zoo Tests //////////
    @Test
    @DisplayName("Tests Zoo Constructor with no parameters")
    void noParameterConstructorTest () {
        Zoo testZoo = new Zoo();
        //assertEquals(75, testZoo.getEnergy(), "Returned wrong energy");
    }

    @Test
    @DisplayName("Tests Zoo Constructor with all parameters")
    void allParameterConstructorTest () {
        Zoo testZoo = new Zoo();
        //assertEquals(70, testZoo.getEnergy(), "Returned wrong energy");
    }

    @Test
    @DisplayName("Tests energy getter and setter methods")
    void energyGetterSetterTest () {
        Zoo testZoo = new Zoo();
        //testZoo.setEnergy(70);
        //assertEquals(70, testZoo.getEnergy(), "Unexpected energy returned");
    }

    @Test
    @DisplayName("Checks if the Zoo's energy levels increase when it eats")
    void zooEnergyTest() {
        Zoo testZoo = new Zoo();
        //testZoo.eat();
        //assertEquals(31, testZoo.getEnergy(), "Energy levels were incorrect");
    }

}