package lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Product product1 = new Product();
        System.out.println(product1.displayInfo());

        Product product2 = new Product(null, "ProductBrand", 200);
        double d = product2.getPrice();
        System.out.println(d);

        product2.setPrice(400);
        System.out.println(product2.displayInfo());

        Product product3 = new Product("");
        System.out.println(product3.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("Вода", "АО Исток", 250, 2);
        System.out.println(bottleOfWater1.displayInfo());

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Молоко#1", "ООО Молочная ферма", 250, 1, 15);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfWater2 = new BottleOfWater("Чистая вода", "ИП Астра", 250, 1);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater3 = new BottleOfWater("Вода столовая", "ООО Источник", 250, 1.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk2 = new BottleOfMilk("Молоко 3%", "ООО Молоко", 250, 1, 15);
        System.out.println(bottleOfMilk1.displayInfo());

        Product snack1 = new Snack("Lays", "PepsiCo", 180, "Печень", 100);
        System.out.println(snack1.displayInfo());

        Product snack2 = new Snack("Naturals", "Lorenc", 220, "Оригинальные", 80); // Здесь проверка на вес упаковки
        System.out.println(snack2.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk2);
        products.add(bottleOfWater3);
        products.add(snack1);
        products.add(snack2);

        VendingMachine vendingMachine = new VendingMachine(products);
        Snack snackOut1 = vendingMachine.getSnack("Lays", "Печень", 100);
        if (snackOut1 == null) {
            System.out.println("Данный товар отсутствует");
        } else {
            System.out.println("Вы купили: " + snackOut1.displayInfo());
        }

        Snack snackOut2 = vendingMachine.getSnack("Lays", "Лук и зелень", 100);
        if (snackOut2 == null) {
            System.out.println("Данный товар отсутствует");
        } else {
            System.out.println("Вы купили: " + snackOut2.displayInfo());
        }

        Snack snackOut3 = vendingMachine.getSnack("Naturals", "Оригинальные", 100);
        if (snackOut3 == null) {
            System.out.println("Данный товар отсутствует");
        } else {
            System.out.println("Вы купили: " + snackOut3.displayInfo());
        }

        Snack snackOut4 = vendingMachine.getSnack("Naturals", "Оригинальные", 120);
        if (snackOut4 == null) {
            System.out.println("Данный товар отсутствует");
        } else {
            System.out.println("Вы купили: " + snackOut4.displayInfo());
        }

    }
}
