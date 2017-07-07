package me.relations.extend;

/**
 * Created by tgs on 2017/7/7 7:46.
 *
 * @星期五
 */
public class Manager extends Employee{


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    public Double getSalary(){
        Double salary = super.getSalary()+this.bonus;
        return salary;
    }


    private double bonus;
}
