package zooKeeperTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zooKeeper.CatFish;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatFishTest {

    ////////// CatFish Tests //////////
    @Test
    @DisplayName("Tests hunger getter and setter methods")
    public void hungerGetterSetterTest() {
        CatFish testCatFish = new CatFish(40, 50);
        testCatFish.setHunger(60);
        assertEquals(60, testCatFish.getHunger(), "Returned incorrect hunger");
    }

    @Test
    @DisplayName("Tests speed getter and setter methods")
    public void speedGetterSetterTest() {
        CatFish testCatFish = new CatFish(40, 50);
        testCatFish.setSpeed(60);
        assertEquals(60, testCatFish.getSpeed(), "Returned incorrect speed");
    }

    @Test
    @DisplayName("Tests CatFish Constructor with no parameters")
    public void noParameterConstructorTest () {
        CatFish testCatFish = new CatFish();
        assertEquals(30, testCatFish.getHunger(), "Returned wrong weight");
        assertEquals(50, testCatFish.getSpeed(),"Returned wrong speed");
    }

    @Test
    @DisplayName("Tests CatFish Constructor with only hunger parameter")
    public void hungerParameterConstructorTest () {
        CatFish testCatFish = new CatFish(40);
        assertEquals(40, testCatFish.getHunger(), "Returned wrong weight");
        assertEquals(50, testCatFish.getSpeed(),"Returned wrong speed");
    }

    @Test
    @DisplayName("Tests CatFish Constructor with hunger and speed parameters")
    public void hungerSpeedParameterConstructorTest () {
        CatFish testCatFish = new CatFish(40, 60);
        assertEquals(40, testCatFish.getHunger(), "Returned wrong weight");
        assertEquals(60, testCatFish.getSpeed(),"Returned wrong speed");
    }

    @Test
    @DisplayName("Checks to see if the catfish's hunger level drops when it eats")
    public void catFishHungerTest() {
        CatFish testCatFish = new CatFish(100, 50);
        testCatFish.eat();
        assertEquals(80, testCatFish.getHunger(), "Hunger level incorrect");
    }

    @Test
    @DisplayName("Makes sure a catfish doesn't exceed its speed limit when speeding up")
    public void catFishGainSpeed() {
        CatFish testCatFish = new CatFish(100, 90);
        testCatFish.gainSpeedInWater();
        assertEquals(100, testCatFish.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Makes sure a catfish can speed up within its speed boundaries")
    public void catFishGainSpeed2() {
        CatFish testCatFish = new CatFish(100, 40);
        testCatFish.gainSpeedInWater();
        assertEquals(65, testCatFish.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Makes sure a catfish's speed will not exceed limit when speeding up despite high original value")
    public void catFishGainSpeed3() {
        CatFish testCatFish = new CatFish(100, 5000);
        testCatFish.gainSpeedInWater();
        assertEquals(100, testCatFish.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Makes sure catfish doesn't get too slow when slowing down")
    public void catFishSlowDown() {
        CatFish testCatFish = new CatFish(100, 30);
        testCatFish.slowDownInWater();
        assertEquals(25, testCatFish.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Makes sure catfish can slow down within its speed boundaries")
    public void catFishSlowDown2() {
        CatFish testCatFish = new CatFish(100, 60);
        testCatFish.slowDownInWater();
        assertEquals(35, testCatFish.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Makes sure catfish can slow down correctly despite high constructor speed value")
    public void catFishSlowDown3() {
        CatFish testCatFish = new CatFish(100, 5000);
        testCatFish.slowDownInWater();
        assertEquals(75, testCatFish.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Checks catfish attributes are correctly changed when it hunts")
    public void catFishHunts() {
        CatFish testCatFish = new CatFish(100, 50);
        testCatFish.huntInWater();
        assertEquals(80, testCatFish.getHunger(),"Incorrect Hunger level");
        assertEquals(50, testCatFish.getSpeed(), "Incorrect Speed level");
    }

}
