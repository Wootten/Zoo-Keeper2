package zooKeeperTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zooKeeper.Cat;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatTest {

    ////////// Cat Tests //////////
    @Test
    @DisplayName("Tests year of birth getter and setter")
    void yobGetterSetterTest() {
        Cat testCat = new Cat(10.3, "Sphinx", Calendar.getInstance().get(Calendar.YEAR), 30);
        testCat.setYearOfBirth(2020);
        assertEquals(2020, testCat.getYearOfBirth(), "Unexpected year returned");
    }

    @Test
    @DisplayName("Tests weight getter and setter")
    void weightGetterSetterTest() {
        Cat testCat = new Cat(10.3, "Sphinx", Calendar.getInstance().get(Calendar.YEAR), 30);
        testCat.setWeight(20.5);
        assertEquals(20.5, testCat.getWeight(), "Unexpected weight returned");
    }

    @Test
    @DisplayName("Tests breed getter and setter")
    void breedGetterSetterTest() {
        Cat testCat = new Cat(10.3, "Sphinx", Calendar.getInstance().get(Calendar.YEAR), 30);
        testCat.setBreed("Tiger");
        assertEquals("Tiger", testCat.getBreed(), "Unexpected breed returned");
    }

    @Test
    @DisplayName("Tests speed getter and setter")
    void speedGetterSetterTest() {
        Cat testCat = new Cat(10.3, "Sphinx", Calendar.getInstance().get(Calendar.YEAR), 30);
        testCat.setSpeed(50);
        assertEquals(50, testCat.getSpeed(), "Unexpected speed returned");
    }

    @Test
    @DisplayName("Tests approx age getter")
    void ageGetterTest() {
        Cat testCat = new Cat(10.3, "Sphinx", 1996, 30);
        assertEquals(25, testCat.getApproximateAge(), "Unexpected age returned");
    }

    @Test
    @DisplayName("Tests Cat Constructor with no parameters")
    void noParameterConstructorTest () {
        Cat testCat = new Cat();
        assertEquals(10.0, testCat.getWeight(), "Returned wrong weight");
        assertEquals("Sphinx", testCat.getBreed(), "Returned wrong breed");
        assertEquals(Calendar.getInstance().get(Calendar.YEAR), testCat.getYearOfBirth(), "Returned incorrect yob");
        assertEquals(50, testCat.getSpeed(),"Returned wrong speed");
    }

    @Test
    @DisplayName("Tests Cat Constructor with only weight parameter")
    void weightParameterConstructorTest () {
        Cat testCat = new Cat(30.0);
        assertEquals(30.0, testCat.getWeight(), "Returned wrong weight");
        assertEquals("Sphinx", testCat.getBreed(), "Returned wrong breed");
        assertEquals(Calendar.getInstance().get(Calendar.YEAR), testCat.getYearOfBirth(), "Returned incorrect yob");
        assertEquals(50, testCat.getSpeed(),"Returned wrong speed");
    }

    @Test
    @DisplayName("Tests Cat Constructor with only weight and breed parameters")
    void weightBreedParameterConstructorTest () {
        Cat testCat = new Cat(30.0, "Tiger");
        assertEquals(30.0, testCat.getWeight(), "Returned wrong weight");
        assertEquals("Tiger", testCat.getBreed(), "Returned wrong breed");
        assertEquals(Calendar.getInstance().get(Calendar.YEAR), testCat.getYearOfBirth(), "Returned incorrect yob");
        assertEquals(50, testCat.getSpeed(),"Returned wrong speed");
    }

    @Test
    @DisplayName("Tests Cat Constructor with only weight, breed and yearOfBirth parameters")
    void weightBreedYobParameterConstructorTest () {
        Cat testCat = new Cat(30.0, "Tiger", Calendar.getInstance().get(Calendar.YEAR));
        assertEquals(30.0, testCat.getWeight(), "Returned wrong weight");
        assertEquals("Tiger", testCat.getBreed(), "Returned wrong breed");
        assertEquals(Calendar.getInstance().get(Calendar.YEAR), testCat.getYearOfBirth(),"Returned wrong yob");
    }


    @Test
    @DisplayName("Tests Cat Constructor with weight, breed and yearOfBirth and speed parameters")
    void allParameterConstructorTest () {
        Cat testCat = new Cat(30.0, "Tiger", Calendar.getInstance().get(Calendar.YEAR), 70);
        assertEquals(30.0, testCat.getWeight(), "Returned wrong weight");
        assertEquals("Tiger", testCat.getBreed(), "Returned wrong breed");
        assertEquals(2021, testCat.getYearOfBirth(), "Returned incorrect yob");
        assertEquals(70, testCat.getSpeed(),"Returned wrong speed");
    }

    @Test
    @DisplayName("Checks a cats year of birth given the current time as a constructor")
    void catAgeTest2() {
        Cat testCat = new Cat(10.3, "Sphinx", Calendar.getInstance().get(Calendar.YEAR), 30);
        assertEquals(2021, testCat.getYearOfBirth(), "The year of birth was incorrect");
    }

    @Test
    @DisplayName("Checks the cat instance's weight increases when it eats")
    void catWeightTest() {
        Cat testCat = new Cat(10.3, "Sphinx", Calendar.getInstance().get(Calendar.YEAR), 30);
        testCat.eat();
        assertEquals(11.3, testCat.getWeight(), "Cat wasn't the expected weight");
    }

    @Test
    @DisplayName("Checks that when a cat swims faster, it can't exceed its maximum speed")
    void catGainSpeed() {
        Cat testCat = new Cat(10.3, "Sphinx", Calendar.getInstance().get(Calendar.YEAR), 65);
        testCat.gainSpeedInWater();
        assertEquals(70, testCat.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Checks that the cat can increase speed within its speed boundaries")
    void catGainSpeed2() {
        Cat testCat = new Cat(10.3, "Sphinx", Calendar.getInstance().get(Calendar.YEAR), 40);
        testCat.gainSpeedInWater();
        assertEquals(50, testCat.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Checks the cat will always be within its speed boundaries despite high constructor values, when speeding up")
    void catGainSpeed3() {
        Cat testCat = new Cat(10.3, "Sphinx", Calendar.getInstance().get(Calendar.YEAR), 5000);
        testCat.gainSpeedInWater();
        assertEquals(70, testCat.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Checks the cat doesn't get slower than its boundary value when slowing down in water")
    void catSlowDown() {
        Cat testCat = new Cat(10.3, "Sphinx", Calendar.getInstance().get(Calendar.YEAR), 30);
        testCat.slowDownInWater();
        assertEquals(30, testCat.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Makes sure the cat can slow down within its speed boundaries")
    void catSlowDown2() {
        Cat testCat = new Cat(10.3, "Sphinx", Calendar.getInstance().get(Calendar.YEAR), 50);
        testCat.slowDownInWater();
        assertEquals(40, testCat.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Makes sure the cat will always be within speed boundaries given a high constructor value, when slowing down")
    void catSlowDown3() {
        Cat testCat = new Cat(10.3, "Sphinx", Calendar.getInstance().get(Calendar.YEAR), 5000);
        testCat.slowDownInWater();
        assertEquals(60, testCat.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Makes sure that when the cat hunts, appropriate variables change correctly")
    void catHunts() {
        Cat testCat = new Cat(10.3, "Sphinx", Calendar.getInstance().get(Calendar.YEAR), 30);
        testCat.huntInWater();
        assertEquals(11.3, testCat.getWeight(), "Incorrect Hunger level");
        assertEquals(30, testCat.getSpeed(), "Incorrect Speed level");
    }
}
