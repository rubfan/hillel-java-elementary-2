public class Main {

    public static void main(String[] args) {
        int myArray[][] = new int[10][10];
        int x, y;
        myArray[0][0] = 1;
        for (y = 1; y < 10; y++) {
            for (x = 0; x < 10; x++) {
                    if (x==0) {
                        myArray[y][x] = 1;
                    }
                    else if (x==y){
                        myArray[y][x] = 1;
                        break;
                    }
                    else  {
                        myArray[y][x] = (myArray[y - 1][x - 1]) + (myArray[y - 1][x]);
                    }
            }
        }
        ShowArray(myArray);
     }
     //Here comes array output
     private static void ShowArray(int z[][]) {
        int x1,y1;
           for (y1=0; y1<10; y1++) {
               for (x1=0; x1<10; x1++) {
                   System.out.print((z[y1][x1])+" ");
               }
               System.out.println(" ");
           }
     }
}