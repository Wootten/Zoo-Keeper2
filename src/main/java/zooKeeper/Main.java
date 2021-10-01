package zooKeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

//import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    @CrossOrigin("http://localhost:3000")
    @GetMapping("/zooCreation")
    public String myZoo() {
        Zoo zooAnimals = new Zoo();
        return zooAnimals.toString();
    }

    @CrossOrigin("http://localhost:3000")
    @GetMapping("/catFishSpeed")
    public String catFishSpeed() {
        CatFish catFish = new CatFish(75, 70);
        int originalSpeed = catFish.getSpeed();
        catFish.gainSpeedInWater();
        int newSpeed = catFish.getSpeed();

        return "Original Speed: " + originalSpeed + " New Speed: " + newSpeed;
    }

    @CrossOrigin("http://localhost:3000")
    @GetMapping("/catTesting")
    public String catTesting() {
        Cat cat = new Cat(10.0, "Tiger", Calendar.getInstance().get(Calendar.YEAR), 50);
        int dob = cat.getYearOfBirth();

        return "Year Of Birth: " + dob;
    }
}
