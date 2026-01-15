package co.istad.genericType.oop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OopApp {
    public static void main(String[] args) {
        School<Person> school1 = new School<>();

        List<Person> students = new ArrayList<>();
        students.add(new Student("Tey", "F", 1.63F, 100.00));
        students.add(new Student("Lisa", "F", 1.58F, 87.00));
        students.add(new Teacher("Vatey", "F",1.67F , BigDecimal.valueOf(200.00)));

        school1.setDataSet(students);

        school1.getDataSet().forEach(human -> {
            System.out.println("Name: " + human.getName());
            System.out.println("Gender: " + human.getG());
            System.out.println("Height: " + human.getHeight());

            if(human instanceof Student obj){
                System.out.println("Score: "+ obj.getScore());
            }else if(human instanceof Teacher obj){
                System.out.println("Salary: "+ obj.getSalary());
            }
        });

    }
}
