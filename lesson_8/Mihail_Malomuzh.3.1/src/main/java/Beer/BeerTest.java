package Beer;

import Beer.Entity.Beer;

public class BeerTest {
    public static void main(String[] args) {
        Beer b = new Beer("Hoegaarden", "2019.11.05", 0.5, 4.9, 3);
        System.out.println(b.toString());
        System.out.println("Is expired = " + b.isExpired());
        b.setTemperature(10);
        System.out.println("Is ready to drink = " + b.isReadyToDrink());
    }
}
