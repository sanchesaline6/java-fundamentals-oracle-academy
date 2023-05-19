package animalshop;

public class Dog {

    private String name;
    private String breed;
    private String barkNoise = "Woof";
    private double weight;

    private Dog(String name, String breed, double weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    private Dog(String name, String breed, String barkNoise, double weight){
        this.name = name;
        this.breed = breed;
        this.barkNoise = barkNoise;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed(){
        return this.breed;
    }

    public String getBarkNoise(){
        return this.barkNoise;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void bark(){
        System.out.println(this.barkNoise);
    }
}
