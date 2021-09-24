package zooKeeperTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zooKeeper.Bat;
import zooKeeper.Cat;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    ////////// Cat Tests //////////
    @Test
    @DisplayName("Tests date of birth getter and setter")
    public void dobGetterSetterTest() {
        Cat testCat = new Cat(10.3, "Sphinx", LocalDate.now(), 30);
        testCat.setDateOfBirth(LocalDate.ofYearDay(2020, 1));
        assertEquals(2020, testCat.getDateOfBirth(), "Unexpected date returned");
    }

    @Test
    @DisplayName("Tests weight getter and setter")
    public void weightGetterSetterTest() {
        Cat testCat = new Cat(10.3, "Sphinx", LocalDate.now(), 30);
        testCat.setWeight(20.5);
        assertEquals(20.5, testCat.getWeight(), "Unexpected weight returned");
    }

    @Test
    @DisplayName("Tests breed getter and setter")
    public void breedGetterSetterTest() {
        Cat testCat = new Cat(10.3, "Sphinx", LocalDate.now(), 30);
        testCat.setBreed("Tiger");
        assertEquals("Tiger", testCat.getBreed(), "Unexpected breed returned");
    }

    @Test
    @DisplayName("Tests speed getter and setter")
    public void speedGetterSetterTest() {
        Cat testCat = new Cat(10.3, "Sphinx", LocalDate.now(), 30);
        testCat.setSpeed(50);
        assertEquals(50, testCat.getSpeed(), "Unexpected speed returned");
    }

    @Test
    @DisplayName("Tests Cat Constructor with no parameters")
    public void noParameterConstructorTest () {
        Cat testCat = new Cat();
        assertEquals(10.0, testCat.getWeight(), "Returned wrong weight");
        assertEquals("Sphinx", testCat.getBreed(), "Returned wrong breed");
        assertEquals(2021, testCat.getDateOfBirth(), "Returned incorrect dob");
        assertEquals(50, testCat.getSpeed(),"Returned wrong speed");
    }

    @Test
    @DisplayName("Tests Cat Constructor with only weight parameter")
    public void weightParameterConstructorTest () {
        Cat testCat = new Cat(30.0);
        assertEquals(30.0, testCat.getWeight(), "Returned wrong weight");
        assertEquals("Sphinx", testCat.getBreed(), "Returned wrong breed");
        assertEquals(2021, testCat.getDateOfBirth(), "Returned incorrect dob");
        assertEquals(50, testCat.getSpeed(),"Returned wrong speed");
    }

    @Test
    @DisplayName("Tests Cat Constructor with only weight and breed parameters")
    public void weightBreedParameterConstructorTest () {
        Cat testCat = new Cat(30.0, "Tiger");
        assertEquals(30.0, testCat.getWeight(), "Returned wrong weight");
        assertEquals("Tiger", testCat.getBreed(), "Returned wrong breed");
        assertEquals(2021, testCat.getDateOfBirth(), "Returned incorrect dob");
        assertEquals(50, testCat.getSpeed(),"Returned wrong speed");
    }

    @Test
    @DisplayName("Tests Cat Constructor with only weight, breed and dob parameters")
    public void weightBreedDobParameterConstructorTest () {
        Cat testCat = new Cat(30.0, "Tiger", LocalDate.now());
        assertEquals(30.0, testCat.getWeight(), "Returned wrong weight");
        assertEquals("Tiger", testCat.getBreed(), "Returned wrong breed");
        assertEquals(2021, testCat.getDateOfBirth(), "Returned incorrect dob");
        assertEquals(50, testCat.getSpeed(),"Returned wrong speed");
    }

    @Test
    @DisplayName("Tests Cat Constructor with only weight, breed and approx age parameters")
    public void weightBreedAgeParameterConstructorTest () {
        Cat testCat = new Cat(30.0, "Tiger", 7);
        assertEquals(30.0, testCat.getWeight(), "Returned wrong weight");
        assertEquals("Tiger", testCat.getBreed(), "Returned wrong breed");
        assertEquals(2014, testCat.getDateOfBirth(), "Returned incorrect dob");
        assertEquals(50, testCat.getSpeed(),"Returned wrong speed");
    }

    @Test
    @DisplayName("Tests Cat Constructor with weight, breed and approx age and speed parameters")
    public void weightBreedAgeSpeedParameterConstructorTest () {
        Cat testCat = new Cat(30.0, "Tiger", 7, 70);
        assertEquals(30.0, testCat.getWeight(), "Returned wrong weight");
        assertEquals("Tiger", testCat.getBreed(), "Returned wrong breed");
        assertEquals(2014, testCat.getDateOfBirth(), "Returned incorrect dob");
        assertEquals(70, testCat.getSpeed(),"Returned wrong speed");
    }

    @Test
    @DisplayName("Tests Cat Constructor with weight, breed and approx age and speed parameters")
    public void allParameterConstructorTest () {
        Cat testCat = new Cat(30.0, "Tiger", LocalDate.now(), 70);
        assertEquals(30.0, testCat.getWeight(), "Returned wrong weight");
        assertEquals("Tiger", testCat.getBreed(), "Returned wrong breed");
        assertEquals(2021, testCat.getDateOfBirth(), "Returned incorrect dob");
        assertEquals(70, testCat.getSpeed(),"Returned wrong speed");
    }

    @Test
    @DisplayName("Checks a cat's date of birth based on a given approximate age")
    public void catAgeTest() {
        Cat testCat = new Cat(10.3, "Sphinx", 5, 30);
        assertEquals(2016, testCat.getDateOfBirth(), "The date of birth was incorrect");
    }

    @Test
    @DisplayName("Checks a cats date of birth given the current time as a constructor")
    public void catAgeTest2() {
        Cat testCat = new Cat(10.3, "Sphinx", LocalDate.now(), 30);
        assertEquals(2021, testCat.getDateOfBirth(), "The date of birth was incorrect");
    }

    @Test
    @DisplayName("Checks the cat instance's weight increases when it eats")
    public void catWeightTest() {
        Cat testCat = new Cat(10.3, "Sphinx", LocalDate.now(), 30);
        testCat.eat();
        assertEquals(11.3, testCat.getWeight(), "Cat wasn't the expected weight");
    }

    @Test
    @DisplayName("Checks that when a cat swims faster, it can't exceed its maximum speed")
    public void catGainSpeed() {
        Cat testCat = new Cat(10.3, "Sphinx", LocalDate.now(), 65);
        testCat.gainSpeedInWater();
        assertEquals(70, testCat.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Checks that the cat can increase speed within its speed boundaries")
    public void catGainSpeed2() {
        Cat testCat = new Cat(10.3, "Sphinx", LocalDate.now(), 40);
        testCat.gainSpeedInWater();
        assertEquals(50, testCat.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Checks the cat will always be within its speed boundaries despite high constructor values, when speeding up")
    public void catGainSpeed3() {
        Cat testCat = new Cat(10.3, "Sphinx", LocalDate.now(), 5000);
        testCat.gainSpeedInWater();
        assertEquals(70, testCat.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Checks the cat doesn't get slower than its boundary value when slowing down in water")
    public void catSlowDown() {
        Cat testCat = new Cat(10.3, "Sphinx", LocalDate.now(), 30);
        testCat.slowDownInWater();
        assertEquals(30, testCat.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Makes sure the cat can slow down within its speed boundaries")
    public void catSlowDown2() {
        Cat testCat = new Cat(10.3, "Sphinx", LocalDate.now(), 50);
        testCat.slowDownInWater();
        assertEquals(40, testCat.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Makes sure the cat will always be within speed boundaries given a high constructor value, when slowing down")
    public void catSlowDown3() {
        Cat testCat = new Cat(10.3, "Sphinx", LocalDate.now(), 5000);
        testCat.slowDownInWater();
        assertEquals(60, testCat.getSpeed(), "Speed incorrect");
    }

    @Test
    @DisplayName("Makes sure that when the cat hunts, appropriate variables change correctly")
    public void catHunts() {
        Cat testCat = new Cat(10.3, "Sphinx", LocalDate.now(), 30);
        testCat.huntInWater();
        assertEquals(11.3, testCat.getWeight(), "Incorrect Hunger level");
        assertEquals(30, testCat.getSpeed(), "Incorrect Speed level");
    }
}
