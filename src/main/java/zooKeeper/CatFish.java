package zooKeeper;

public class CatFish extends Fish implements Swim {

    //////////Attributes//////////
    private int hunger;
    private int speed;

    //////////Constructors////////

    public CatFish(int hunger, int speed) {
        this.hunger = hunger;
        this.speed = speed;
    }

    public CatFish(int hunger) {
        this.hunger = hunger;
        this.speed = 50;
    }

    public CatFish() {
        this.hunger = 30;
        this.speed = 50;
    }

    //////////Methods/////////////
    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String eat() {
        this.hunger = this.hunger - 20;
        return "I eat other fish because i'm a cannibal";
    }

    @Override
    public void gainSpeedInWater() {
        speedCheck();
        System.out.println("I am swimming faster");
        if (this.speed < 100) {
            this.speed = this.speed + 25;
        } else {
            this.speed = 100;
        }
        speedCheck();
    }

    @Override
    public void slowDownInWater() {
        speedCheck();
        System.out.println("I am swimming slower");
        if (this.speed >= 25) {
            this.speed = this.speed - 25;
        } else {
            this.speed = 25;
        }
        speedCheck();
    }

    @Override
    public void speedCheck() {
        int currentSpeed = getSpeed();
        if (currentSpeed > 100) {
            this.speed = 100;
        } else if (currentSpeed < 25) {
            this.speed = 25;
        }
    }

    @Override
    public String huntInWater() {
        gainSpeedInWater();
        eat();
        slowDownInWater();
        return "I have caught my prey!";
    }

    /*@Override
    public String toString() {
        return "{" +
                "\"hunger\"= \"" + hunger +
                "\", \"speed\"=\"" + speed +
                "\"}";
    }*/
}
