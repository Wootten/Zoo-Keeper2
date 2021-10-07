package zooKeeper;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.boot.autoconfigure.SpringBootApplication
@RestController
public class Main {
    Zoo zooAnimals = new Zoo();

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    @CrossOrigin("http://localhost:3000")
    @GetMapping("/zooCreation")
    public String myZoo() {
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
        Cat cat = new Cat(10.0, "Tiger", 1996, 50);
        int dob = cat.getYearOfBirth();
        String hunt = cat.huntInWater();
        int age = cat.getApproximateAge();

        return "Year Of Birth: " + dob + " ,Approximate age: " + age + " ,Hunting status: " + hunt;
    }

    @CrossOrigin("http://localhost:3000")
    @GetMapping("/catSelect")
    public String catSelect() {
        List<Animal> animals = zooAnimals.getZooAnimals();
        Animal selectedAnimal;
        selectedAnimal = animals.get(0);
        String json = new Gson().toJson(selectedAnimal);
        return json;
    }

    @CrossOrigin("http://localhost:3000")
    @GetMapping("/catFishSelect")
    public String catFishSelect() {
        Zoo zooAnimals = new Zoo();
        List<Animal> animals = zooAnimals.getZooAnimals();
        Animal selectedAnimal;
        selectedAnimal = animals.get(1);
        String json = new Gson().toJson(selectedAnimal);
        return json;
    }

    @CrossOrigin("http://localhost:3000")
    @GetMapping("/batSelect")
    public String batSelect() {
        List<Animal> animals = zooAnimals.getZooAnimals();
        Animal selectedAnimal;
        selectedAnimal = animals.get(2);
        String json = new Gson().toJson(selectedAnimal);
        return json;
    }

    @CrossOrigin("http://localhost:3000")
    @GetMapping("/pigeonSelect")
    public String pigeonSelect() {
        List<Animal> animals = zooAnimals.getZooAnimals();
        Animal selectedAnimal;
        selectedAnimal = animals.get(3);
        String json = new Gson().toJson(selectedAnimal);
        return json;
    }

    @CrossOrigin("http://localhost:3000")
    @PostMapping("/addCat")
    public String addCat(String weight, String breed, String yob, String speed) {
        List<Animal> animals = zooAnimals.getZooAnimals();
        double weightOfCat = Double.parseDouble(weight);
        int yobOfCat = Integer.parseInt(yob);
        int speedOfCat = Integer.parseInt(speed);
        Cat cat = new Cat(weightOfCat, breed, yobOfCat, speedOfCat);
        animals.add(cat);
        return cat.toString();
    }
}
