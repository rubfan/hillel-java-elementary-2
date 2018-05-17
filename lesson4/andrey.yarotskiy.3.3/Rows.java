public class Rows {

    public static void main(String[] args) {
        System.out.println("Lesson_4.1:");
        for (int i = 1000; i < 10000; i+=3) {
            System.out.print(i + " ");
        }

        System.out.println("\nLesson_4.2:");
        int n = 0;
        for (int i = 1; n<55; i+=2) {
            System.out.print(i + " ");
            n++;
        }

        System.out.println("\nLesson_4.3:");
        for (int i = 90; i >= 0 ; i-=5) {
            System.out.print(i + " ");
        }

        System.out.println("\nLesson_4.4:");
        int k = 0;
        for (int i = 2; k < 20; i <<= 1) {
            System.out.print(i + " ");
            k++;
        }
    }
}
