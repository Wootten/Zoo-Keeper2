package zooKeeper;
//import java.time.LocalDate;
import java.util.Calendar;

public class Cat extends Mammal implements Swim {


    private double weight;
    private String breed;
    private int yearOfBirth;
    private int speed;


    public Cat(double weight, String breed, int yearOfBirth, int speed){
        this.weight = weight;
        this.breed = breed;
        this.yearOfBirth = yearOfBirth;
        this.speed = speed;
    }

    public Cat(double weight, String breed, int yearOfBirth){
        this.weight = weight;
        this.breed = breed;
        this.yearOfBirth = yearOfBirth;
        this.speed = 50;
    }

    public Cat(double weight, String breed) {
        this.weight = weight;
        this.breed = breed;
        this.yearOfBirth = Calendar.getInstance().get(Calendar.YEAR);
        this.speed  = 50;
    }

    public Cat(double weight) {
        this.weight = weight;
        this.breed = "Sphinx";
        this.yearOfBirth = Calendar.getInstance().get(Calendar.YEAR);
        this.speed  = 50;
    }

    public Cat() {
        this.weight = 10.0;
        this.breed = "Sphinx";
        this.yearOfBirth = Calendar.getInstance().get(Calendar.YEAR);
        this.speed  = 50;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getApproximateAge() {
        int approximateAge = (Calendar.getInstance().get(Calendar.YEAR) - this.yearOfBirth);
        return approximateAge;
    }

    @Override
    public String eat() {
        this.weight++;
        return "Yummy food";
    }

    @Override
    public void gainSpeedInWater() {
        speedCheck();
        System.out.println("I am swimming faster");
        if (this.speed < 70) {
            this.speed = this.speed + 10;
        } else {
            this.speed = 70;
        }
        speedCheck();
    }

    @Override
    public void slowDownInWater() {
        speedCheck();
        System.out.println("I am swimming slower");
        if (this.speed > 30) {
            this.speed = this.speed - 10;
        } else {
            this.speed = 30;
        }
        speedCheck();
    }

    @Override
    public void speedCheck() {
        int currentSpeed = getSpeed();
        if (currentSpeed > 70) {
            this.speed = 70;
        } else if (currentSpeed < 30) {
            this.speed = 30;
        }
    }

    @Override
    public String huntInWater() {
        this.gainSpeedInWater();
        this.eat();
        this.slowDownInWater();
        return "I have caught my prey!";
    }

    @Override
    public String toString() {
        return "{" +
                "\"weight\"= \"" + weight +
                "\", \"breed\"=\"" + breed +
                "\", \"Year Of Birth\"=\"" + yearOfBirth +
                "\", \"Speed\"=\"" + speed +
                "\"}";
    }
}
