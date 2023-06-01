package HomeWorkOOP.HW1;

public class Chocolate extends Product{
    
    private int calories;
    private String color;

    public double getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }   

    public Chocolate(String brand, String name, double price, int calories, String color) {
        super(brand, name, price);
        this.calories = calories;
        this.color = color;
    }

    @Override
    public String displayInfo() {
        return String.format("[Упаковка] %s - %s - %f [калории: %d; цвет: %s]", brand, name, price, calories, color);
    }
}