package MyHomeworks.Homework6.Task3;

import java.util.Arrays;
import java.util.List;


public class Goods {

    public static class Fruit {
        private String name;
        private String color;
        private double price;

        public Fruit(String name, String color, double price) {
            this.name = name;
            this.color = color;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void printFilteredGoods(List<Fruit> fruits) {
        fruits.stream()
                .filter(good -> good.getColor().equals("Red"))
                .filter(good -> good.getPrice() > 1.5)
                .forEach(good -> System.out.println(good.getName()));
    }

    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
                new Fruit("Apple", "Red", 1.99),
                new Fruit("Banana", "Yellow", 0.99),
                new Fruit("Strawberry", "Red", 2.49),
                new Fruit("Blueberry", "Blue", 3.99),
                new Fruit("Cherry", "Red", 1.49),
                new Fruit("Grape", "Green", 1.79),
                new Fruit("Watermelon", "Green", 4.99),
                new Fruit("Pineapple", "Yellow", 2.99)
        );
        printFilteredGoods(fruits);
    }
}