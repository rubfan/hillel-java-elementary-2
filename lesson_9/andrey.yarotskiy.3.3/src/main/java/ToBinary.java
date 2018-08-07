import com.sun.javafx.fxml.expression.BinaryExpression;

/**
 * Created by My on 07.08.2018.
 */
public class ToBinary {
    public static void main(String[] args) {
        System.out.println(toBinary(0));
        System.out.println(toBinary(1));
        System.out.println(toBinary(2));
        System.out.println(toBinary(3));
        System.out.println(toBinary(4));
        System.out.println(toBinary(5));
        System.out.println(toBinary(6));
        System.out.println(toBinary(7));
        System.out.println(toBinary(8));
        System.out.println(toBinary(9));
        System.out.println(toBinary(10));
        System.out.println(toBinary(2048));

        System.out.println(toBinary(0));
        System.out.println(toBinary(-1));
        System.out.println(toBinary(-2));
        System.out.println(toBinary(-3));
    }

    public static String toBinary(int decimal) {
        if(decimal < 0){
            return "-" + toBinary(-decimal);
        }else if (decimal > 1) {
            int number = decimal % 2;
            int divided = decimal / 2;
            String higherNum = toBinary(divided);

            return higherNum + number;
        } else {
            return Integer.toString(decimal);
        }

    }
}
