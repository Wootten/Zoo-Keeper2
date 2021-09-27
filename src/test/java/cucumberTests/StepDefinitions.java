package cucumberTests;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMethods {
    static String canIHunt(int hunger) {
        String hunt = "";
        if (hunger >= 50) {
            hunt = "Yes";
        } else if (hunger <= 20) {
            hunt = "No";
        }
        return hunt;
    }

    static String canISwimFaster(int speed) {
        String faster = "";
        if (speed <= 60) {
            faster = "Speed Up";
        } else if (speed >= 70) {
            faster = "Not Speed Up";
        }
        return faster;
    }

    static String isItNightOrDay(String isNightTime) {
        String eat = "";
        if (isNightTime.equals("true")) {
            eat = "Eat";
        } else if (isNightTime.equals("false")) {
            eat = "Not Eat";
        }
        return eat;
    }
}

public class StepDefinitions {
    private int hunger;
    private String actualAnswer;

    //CatFish hunts story
    @Given("hunger is greater than {int}")
    public void hungerOver50(int hungerHigh) {
        hunger = hungerHigh;
    }

    @Given("hunger is less than {int}")
    public void hungerLessThan20(int hungerLow) {
        hunger = hungerLow;
    }

    @When("I ask to hunt")
    public void iAskToHunt() {
        actualAnswer = TestMethods.canIHunt(hunger);
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }


    //Cat swims faster story
    private String actual;
    private int speed;

    @Given("speed is less than or equal to {int}")
    public void speedIsLessThan(int speedLow) {
        speed = speedLow;
    }

    @Given("speed is equal to or greater than {int}")
    public void speedIsGreaterThan(int speedHigh) {
        speed = speedHigh;
    }

    @When("I ask to swim faster")
    public void iAskToSwimFaster() {
        actual = TestMethods.canISwimFaster(speed);
    }

    @Then("I should {string}")
    public void iShould(String expected) {
        assertEquals(expected, actual);
    }

    //Bat eats in day story
    private String isNightTime;
    private String actualResult;

    @Given("It is night time is {string}")
    public void itIsNightTimeIs(String nightTime) {
        isNightTime = nightTime;
    }

    @Given("It's night time is {string}")
    public void itIsDayTime(String dayTime) {
        isNightTime = dayTime;
    }

    @When("I ask to eat")
    public void iAskToEat() {
        actualResult = TestMethods.isItNightOrDay(isNightTime);
    }

    @Then("I will {string}")
    public void iWillEat(String expectedResult) {
        assertEquals(expectedResult, actualResult);
    }

}
