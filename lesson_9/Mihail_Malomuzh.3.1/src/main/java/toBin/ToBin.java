package toBin;

public class ToBin {

    private static void RecursiveDecToBin(int dec, StringBuilder out, int level){
        if ((dec != 0) && (level < 32)){
            out.insert(0,dec & 1);;
            RecursiveDecToBin(dec >> 1, out, ++level);
        }
    }

    public static String DecToBin(int dec){
        if (dec == 0) return "0";
        StringBuilder num = new StringBuilder();
        RecursiveDecToBin(dec, num, 0);
        return num.toString();
    }


    public static void main(String[] args) {
        int i = 465456;
        System.out.println(DecToBin(i));
        System.out.println(Integer.toBinaryString(i));
    }


}
