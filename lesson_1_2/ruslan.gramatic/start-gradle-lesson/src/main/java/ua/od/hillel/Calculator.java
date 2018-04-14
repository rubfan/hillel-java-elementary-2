package ua.od.hillel;

/**
 * Created by ruslangramatic on 4/14/18.
 */
public class Calculator implements ICalculator{

    private Double result;

    @Override
    public void sub(Float par1, Float par2) {
        result = Double.valueOf(par1 - par2);
    }

    @Override
    public void add(Float par1, Float par2) {
        result = Double.valueOf(par1 + par2);
    }

    @Override
    public void div(Float par1, Float par2) {
        result = Double.valueOf(par1 / par2);
    }

    @Override
    public void mul(Float par1, Float par2) {
        result = Double.valueOf(par1 * par2);
    }

    @Override
    public Double getResult() {
        return result;
    }
}
