package zooKeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


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
    public String ZooTwo() {
        CatFish catFish = new CatFish(75, 70);
        int originalSpeed = catFish.getSpeed();
        catFish.gainSpeedInWater();
        int newSpeed = catFish.getSpeed();

        return "Original Speed: " + originalSpeed + " New Speed: " + newSpeed;
    }
}
