package HomeWork.HomeWorkOOP.HW2.HW;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 5), new Cat("Vasilij", 50), 
            new Cat("Bombilo", 50), new Cat("Snezhok", 25), 
            new Cat("Kuzma", 5), new Cat("Kote", 1)};
        Plate plate = new Plate(80);
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}