import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int arSize;
        int maxTurnCount, turnCount = 0;
        int x = 0, y = 0;
        int nextNum = 1;

        Scanner GetKeyb = new Scanner(System.in);
        System.out.println("Input Array size:");
        arSize = GetKeyb.nextInt();

        int myArray[][] = new int[arSize][arSize];
        maxTurnCount = arSize / 2 - 1;

        for (x = 0; x < arSize; x++) {
            myArray[0][x] = nextNum;
            nextNum++;
        }
        for (y = 1; y < arSize; y++) {
            myArray[y][arSize - 1] = nextNum;
            nextNum++;
        }
        for (x = arSize - 2; x >= 0; x--) {
            myArray[arSize - 1][x] = nextNum;
            nextNum++;
        }
        for (y = arSize - 2; y >= 1; y--) {
            myArray[y][0] = nextNum;
            nextNum++;
        }

        x = 1;
        y = 1;
        while (turnCount < maxTurnCount) {
            while (myArray[y][x + 1] == 0) {
                myArray[y][x] = nextNum;
                nextNum++;
                x++;
            }
            while (myArray[y + 1][x] == 0) {
                myArray[y][x] = nextNum;
                nextNum++;
                y++;
            }
            while (myArray[y][x - 1] == 0) {
                myArray[y][x] = nextNum;
                nextNum++;
                x--;
            }
            while (myArray[y - 1][x] == 0) {
                myArray[y][x] = nextNum;
                nextNum++;
                y--;
            }
            turnCount++;
        }
        for (y = 0; y < arSize; y++) {
            for (x = 0; x < arSize; x++) {
                if (myArray[y][x] == 0) myArray[y][x] = arSize * arSize;
            }
        }
        ShowArray(myArray);
    }

    //Here comes array output
    private static void ShowArray(int z[][]) {
        for (int y1 = 0; y1 < z.length; y1++) {
            for (int x1 = 0; x1 < z.length; x1++) {
                if (z[y1][x1] < 10 || z[y1][x1] == 0)
                    System.out.print("0" + z[y1][x1] + " ");
                else
                    System.out.print((z[y1][x1]) + " ");
            }
            System.out.println(" ");
        }
        System.out.println("                  ");
    }
}