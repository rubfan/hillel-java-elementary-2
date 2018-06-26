/**
 * @author artem.sharpilo
 * This class takes argument from command line and sum them
 */
public class cmdSum {
    /**
     *
     *@param args int x, int y from cmd
     */
    public static void main (String[] args){
        System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
    }
}
