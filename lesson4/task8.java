package lesson4;

public class task8 {
    public static void main(String[] args) {
        int x = 0;
        for ( int i = 100000; i <= 999999; i++ ){
            int n1 = i/100000;
            int n2 = (i%100000)/10000;
            int n3 = (i%10000)/1000;
            int n4 = (i%1000)/100;
            int n5 = (i%100)/10;
            int n6 = i%10;
                if (n1 + n2 + n3 == n4 + n5 + n6){
                x++;
                }
        }
        System.out.println(x + " Number of lucky tickets");
    }
}
