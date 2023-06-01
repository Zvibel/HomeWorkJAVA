package HomeWorkOOP.HW1;
import java.util.List;

public class VendingMachine {

    private final List<Product> products;



    public VendingMachine(List<Product> products) {

        this.products = products;
    }

    /*public BottleOfWater getBottleOfWater(double volume){

        for(Product product : products){
            if (product instanceof BottleOfWater){
               if ( ((BottleOfWater)product).getVolume()  == volume){
                   return (BottleOfWater)product;
               }
            }
        }
        return null;
    }*/
    
    public Chocolate getChocolate(int calories, String color) {
        for(Product product : products){
            if (product instanceof Chocolate){
               if (((Chocolate)product).getCalories() == calories & (((Chocolate)product).getColor() == color)) {
                   return (Chocolate)product;
                   }
            }
        }
        return null;
    }

}
