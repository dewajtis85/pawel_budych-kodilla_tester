public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void bestOne() {
        if (this.price <= 1000 && this.year >= 2019) {
            System.out.println("This is the one to buy.");
        } else if (this.price > 1000 && this.year > 2019) {
            System.out.println("I won't buy this one.");
        } else {
            System.out.println("I won't buy it either.");
        }
    }

    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This device is light.");
        } else if (this.weight >= 700 && this.weight <= 1700) {
            System.out.println("This device is not too heavy.");
        } else {
            System.out.println("This device is heavy.");
        }
    }
}



