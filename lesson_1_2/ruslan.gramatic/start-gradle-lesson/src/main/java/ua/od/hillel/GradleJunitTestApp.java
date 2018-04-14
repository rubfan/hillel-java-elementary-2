package ua.od.hillel;

import static java.lang.System.out;

/**
 * Created by ruslangramatic on 4/14/18.
 */
public class GradleJunitTestApp {
    public static void main(String[] args) {
        GradleJunitTestApp gjta = new GradleJunitTestApp();
        Double result = gjta.calculateSmth();
        out.println(result);
    }

    private Double calculateSmth() {
        Calculator calc = new Calculator();
        //calc.add();
        //calc.div();
        //calc.mul();
        //return calc.getResult();
        return null;
    }
}



