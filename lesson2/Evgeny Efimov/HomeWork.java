public class HomeWork {
    public static void main(String[] args) {
        System.out.println("найти минимальное " + findMin(1, 2, 3));
        System.out.println("==============================");
        System.out.println("найти максимальное " + findMax(1, 2, 3));
        System.out.println("==============================");
        System.out.print("рваспечатать минимальное ");
        printMin(1, 2, 3);
        System.out.println("==============================");
        System.out.println("чётное нечётное " + EvOdNum(4));
        System.out.println("==============================");
        System.out.println("определить деление без остатка " + divisionWithoutResidue(4, 2));
        System.out.println("==============================");
        System.out.println("найти ближайшее к 10: " + findTheNearest(10, 2, -1));
        System.out.println("==============================");
        System.out.println("расчёт аренды " + rentPrice(10));
    }

    public static int findMin(int a, int b, int c) {
        int[] arr = {a, b, c};
        int min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[min] > arr[i + 1]) min = i + 1;
        }
        return arr[min];
    }

    public static int findMax(int a, int b, int c) {
        int[] arr = {a, b, c};
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[max] < arr[i + 1]) max = i + 1;
        }
        return arr[max];
    }

    public static void printMin(int a, int b, int c) {
        int min = findMin(a, b, c);
        int[] arr = {a, b, c};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) System.out.println(arr[i]);
        }
    }

    public static boolean EvOdNum(int a) {
        return a % 2 == 0;
    }

    public static boolean divisionWithoutResidue(int a, int b) {
        return a % b == 0;
    }

    public static int findTheNearest(int pivot, int a, int b) {
        if (a == b) return a;
        int c = Math.abs(pivot - a);
        int d = Math.abs(pivot - b);
        if (c > d) return b;
        else return a;
    }

    public static int rentPrice(int amountOfDays) {
        int pricePerDay = 40;
        int discount = 0;
        if (amountOfDays > 5) discount = 20;
        if (amountOfDays > 7) discount = 50;
        return pricePerDay * amountOfDays - discount;
    }


}
