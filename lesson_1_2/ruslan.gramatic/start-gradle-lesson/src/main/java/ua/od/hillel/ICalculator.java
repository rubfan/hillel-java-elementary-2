package ua.od.hillel;

/**
 * Created by ruslangramatic on 4/14/18.
 */
public interface ICalculator {
    void sub(Float par1, Float par2);
    void add(Float par1, Float par2);
    void div(Float par1, Float par2);
    void mul(Float par1, Float par2);
    public Double getResult();
}
