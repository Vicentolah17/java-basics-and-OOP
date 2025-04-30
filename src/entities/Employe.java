package entities;

public class Employe {
    public String name;
    public double grossSalary;
    public double tax;
    public double percentage;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(){
        grossSalary += grossSalary * percentage / 100.0;
    }





}
