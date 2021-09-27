package zooKeeper;

public class Pigeon extends Bird {
    //////////Attributes//////////
    private int energy;

    //////////Constructors////////
    public Pigeon(int energy) {
        this.energy = energy;
    }

    public Pigeon() {
        this.energy = 75;
    }

    //////////Methods/////////////
    //This is a comment
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public String eat() {
        this.energy++;
        return "I like to eat worms";
    }

}
