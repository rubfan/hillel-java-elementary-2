package cmdCalc;

import java.util.Scanner;

public class CmdCalc {
    public static void main(String[] args) {

        for (int a = 0; a < args.length; a++) {}
            int a1 = Integer.parseInt(args[0]);
            int a2 = Integer.parseInt(args[2]);
            String s = String.format(args[1]);


            if (s.equals("+") || s.equals("add"))
                System.out.println(a1 + "+" + a2 + " = " + ((a1 + a2)));
            else if (s.equals("-") || s.equals("subtract"))
                System.out.println(a1 + "-" + a2 + " =" + (a1 - a2));
            else if (s.equals("x") || s.equals("multiply"))
                System.out.println(a1 + "*" + a2 + " =" + (((int) (a1 * a2))));
            else if (args[1].equals("/") || s.equals("divide"))
                System.out.println(a1 + "/" + a2 + " =" + ((double) a1 / a2));
            else if (s.equals("%") || s.equals("remainder"))
                System.out.println(a1 + "%" + a2 + " =" + ((double) a1 % (double) a2));
            else if (s.equals("mod"))
                System.out.println(a1 + " mod " + a2 + " =" + Math.abs(a1) + " and " + Math.abs(a2));


        }

    }
