package HomeWorkOOP.HW1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        //int a = 12;



        Product product1 = new Product();
        //product1.brand = "ООО Чистый Источник";
        //product1.name = "Бутылка с водой";
        //product1.price = 125.15;
        System.out.println(product1.displayInfo());

        Product product2 = new Product("ООО Чистый Источник", "Бутылка с водой #2", -90.15);
        //product2.brand = "ООО Чистый Источник";
        //product2.name = "__";
        //product2.price = -15;
        product2.setPrice(-30);
        System.out.println(product2.displayInfo());

        BottleOfWater bottleOfWater1 =
                new BottleOfWater("ООО Чистый Источник", "Бутылка с водой #3", -90.15, 1.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk
                = new BottleOfMilk("ООО Чистый Источник", "Бутылка с молоком #1", -90.15, 1.5, 10);

        System.out.println(bottleOfMilk.displayInfo());

        Product whiteChocolate =
            new Chocolate("ООО Алёнка", "Белый шоколад", -90.15, 150, "Белый");

        System.out.println(whiteChocolate.displayInfo());

        Product blackChocolate =
            new Chocolate("ООО Алёнка", "Чёрный шоколад", -90.15, 120, "Чёрный");

        System.out.println(blackChocolate.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(bottleOfWater1);
        products.add(bottleOfMilk);
        products.add(whiteChocolate);
        products.add(blackChocolate);

        VendingMachine vendingMachine = new VendingMachine(products);
        /*BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(1.5);
        if (bottleOfWaterResult != null){
            System.out.println("Вы купили:");
            System.out.println(bottleOfWaterResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }*/

        Chocolate chocolateResult = vendingMachine.getChocolate(120, "Белый");
        if (chocolateResult != null) {
            System.out.println("Вы купили:");
            System.out.println(chocolateResult.displayInfo());
        }
        else {
            System.out.println("Такой упаковки шоколада нет");
        }
    }

}
