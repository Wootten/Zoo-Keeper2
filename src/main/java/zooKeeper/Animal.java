package zooKeeper;

public abstract class Animal {

    //////////Attributes//////////



    //////////Constructors////////



    //////////Methods/////////////
    public abstract String breathe();

    public abstract String eat();

    public String sleep(){
        return "ZZZ zzz ZZZ zzz";
    }

    public String die() {
        return "RIP - I am dead";
    }

}
