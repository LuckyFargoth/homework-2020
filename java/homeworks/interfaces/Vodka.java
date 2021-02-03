package homeworks.interfaces;

public class Vodka {
    private int price, discount;
    private String brand, country;
    private double strength, density;
    private String size, volume;

    public void drinkTooMuch() {
        System.out.println("Stumble around");
    }

    public void drinkTooMuch(String size) {
        System.out.println("It's gonna be a problem");
    }
}
