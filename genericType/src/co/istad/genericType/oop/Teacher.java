package co.istad.genericType.oop;

import java.math.BigDecimal;

public class Teacher extends Person{
    private BigDecimal salary;

    public Teacher(){}

    public Teacher(String name, String g, Float height, BigDecimal salary) {
        super(name, g, height);
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
