package zooKeeper;

public class Bat extends Mammal {
    //////////Attributes//////////
    private boolean nightTime;

    //////////Constructors////////
    public Bat(boolean nightTime) {
        this.nightTime = nightTime;
    }

    public Bat() {
        this.nightTime = true;
    }

    //////////Methods/////////////
    public boolean isNightTime() {
        return nightTime;
    }

    public void setNightTime(boolean nightTime) {
        this.nightTime = nightTime;
    }

    @Override
    public String eat() {
        if (this.nightTime == true) {
            return "Eating because it's night time";
        } else {
            return "It is day time so I am sleeping";
        }
    }
}
