package zooKeeper;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Zoo {
    private List<Animal> zooAnimals = new ArrayList();

    public Zoo() {
        this.zooAnimals.add(new Cat(20, "Tiger", Calendar.getInstance().get(Calendar.YEAR), 40));
        this.zooAnimals.add(new CatFish(50,70));
        this.zooAnimals.add(new Bat(true));
        this.zooAnimals.add(new Pigeon(70));
    }

    public List<Animal> getZooAnimals() {
        return this.zooAnimals;
    }

    public String toString() {
        String json = new Gson().toJson(zooAnimals);
        return json;
    }
}
