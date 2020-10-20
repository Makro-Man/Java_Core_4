package ua.lviv.lgs.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Monkey",45.3,4);
        System.out.println("Name of animal: "+animal.getName()+" Speed animal: "+animal.getSpeed()+" Age of animal: "+animal.getAge());
        System.out.println(animal);
        animal.setName("Леопард");
        animal.setSpeed(20);
        animal.setAge(7);
        System.out.println(animal);
        animal.setName("Бик");
        animal.setSpeed(2);
        animal.setAge(14);
    }
}
