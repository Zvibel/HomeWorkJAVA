package HomeWork.HomeWorkOOP.HW2.HW;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;
 
        food -= n;
        return true;
    }
    void addFood(int food) {
        this.food += food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}