
public class Task72 {
    public static void main(String[] args) {

        Dog d1 = new Dog("Buba", 1, "Spitz");
        System.out.println("You need " + d1.foodPerYearNeeded() + " $ per year to feed " + d1.name);

        Cigarettes marlboro= new Cigarettes("Marlboro", 20);
        marlboro.smokeCigarette(5);
        System.out.println("You have "+ marlboro.count + " cigarettes " + "of "+marlboro.name+ " to smoke");
    }
}
 class Dog {
    String name;
    int age;
    String breed;

    Dog(String name, int age, String breed) {
        this.age=age;
        this.name=name;
        this.breed=breed;
    }


    int foodPerYearNeeded() {
        int price_kg_per_month = 10;
        int price_for_food_per_year;
        price_for_food_per_year = price_kg_per_month * 12;
        return price_for_food_per_year;
    }
}

class Cigarettes{
    String name;
    int count;
    Cigarettes(String name, int count){
        this.count=count;
        this.name=name;
    }

    void smokeCigarette(int c){
        if (c==0) return ;
        count--;
        smokeCigarette(c-1);
    }
}

