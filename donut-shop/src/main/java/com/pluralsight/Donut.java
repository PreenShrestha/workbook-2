package com.pluralsight;

public class Donut {
    private String type;
    private int calories;
    private double price;
    private String description;

    public Donut(String type, int calories, double price, String description) {
        this.type = type;
        this.calories = calories;
        this.price = price;
        this.description = description;
    }

    public String toString() {
        return "Donut Type: " + type + "\n" +
                "Calories: " + calories + "\n" +
                "Price: $" + price + "\n" +
                "Description: " + description + "\n";
    }

}

public class Main{
    public static void main(String[] args) {
        Donut donut1 = new Donut("Glazed", 250, 1.50, "Classic glazed donut");
        Donut donut2 = new Donut("Chocolate Frosted", 300, 2.00, "Chocolate-frosted and sprinkled donut");
    }
}
