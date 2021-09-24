package zooKeeper;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
//import java.time.temporal.ChronoUnit;

public class Cat extends Mammal implements Swim {

    //////////Attributes//////////
    private double weight;
    private String breed;
    private LocalDate dateOfBirth;
    private int speed;

    //////////Constructors////////
    public Cat(double weight, String breed, LocalDate dateOfBirth, int speed){
        this.weight = weight;
        this.breed = breed;
        this.dateOfBirth = LocalDate.now();
        this.speed = speed;
    }

    public Cat(double weight, String breed, int approximateAge, int speed){
        this.weight = weight;
        this.breed = breed;
        this.dateOfBirth = LocalDate.now().minus(approximateAge, ChronoUnit.YEARS);
        this.speed = speed;
    }

    public Cat(double weight, String breed, LocalDate dateOfBirth){
        this.weight = weight;
        this.breed = breed;
        this.dateOfBirth = LocalDate.now();
        this.speed = 50;
    }

    public Cat(double weight, String breed, int approximateAge){
        this.weight = weight;
        this.breed = breed;
        this.dateOfBirth = LocalDate.now().minus(approximateAge, ChronoUnit.YEARS);
        this.speed = 50;
    }

    public Cat(double weight, String breed) {
        this.weight = weight;
        this.breed = breed;
        this.dateOfBirth = LocalDate.now();
        this.speed  = 50;
    }

    public Cat(double weight) {
        this.weight = weight;
        this.breed = "Sphinx";
        this.dateOfBirth = LocalDate.now();
        this.speed  = 50;
    }

    public Cat() {
        this.weight = 10.0;
        this.breed = "Sphinx";
        this.dateOfBirth = LocalDate.now();
        this.speed  = 50;
    }

    //////////Methods/////////////
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

    public int getDateOfBirth() {
        StringBuilder sb = new StringBuilder();
        String dobString = this.dateOfBirth.toString();
        char thousand = dobString.charAt(0);
        char hundred = dobString.charAt(1);
        char ten = dobString.charAt(2);
        char unit = dobString.charAt(3);
        sb.append(thousand);
        sb.append(hundred);
        sb.append(ten);
        sb.append(unit);
        String dobYear = sb.toString();
        int dobYearInt = Integer.parseInt(dobYear);
        return dobYearInt;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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
    public void huntInWater() {
        this.gainSpeedInWater();
        System.out.println("I have caught my prey!");
        this.eat();
        this.slowDownInWater();
    }
}
