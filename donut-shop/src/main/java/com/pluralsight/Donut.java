package com.pluralsight;

class Donut {
    String type;
    int calories;
    double price;
    String description;

    public Donut(String type, int calories, double price, String description) {
        this.type = type;
        this.calories = calories;
        this.price = price;
        this.description = description;
    }


    @Override

    public String toString() {
        return "Donut Type: " + type + "\n" +
                "Calories: " + calories + "\n" +
                "Price: $" + price + "\n" +
                "Description: " + description + "\n";
    }

}

class Main {
    public static void main(String[] args) { //description of donuts
        Donut donut1 = new Donut("Glazed", 200, 1.50, "Classic glazed donut");
        Donut donut2 = new Donut("Chocolate Frosted", 300, 2.20, "Chocolate-frosted and sprinkled donut");
        Donut donut3 = new Donut("Jelly Filled", 250, 1.75, "Sweet jelly-filled donut, for sweet mouth ");
        Donut donut4 = new Donut("Cinnamon Sugar", 260, 1.80, "Little spice with cinnamon and sugar-coated donut");
        Donut donut5 = new Donut("Blueberry", 220, 2.25, "Delicious Blueberry-flavored donut");
        Donut donut6 = new Donut("Maple Bacon", 350, 2.70, "Maple-glazed donut with bacon bits");

        Donut[] donuts = {donut1, donut2, donut3, donut4, donut5, donut6};

        double totalPrice = 0.0;

        for (Donut donut : donuts) {
            System.out.println(donut);
            totalPrice += donut.price;

        }
        System.out.println("Total Price for Donuts: $" + totalPrice); //Extra Credit
    }
}
