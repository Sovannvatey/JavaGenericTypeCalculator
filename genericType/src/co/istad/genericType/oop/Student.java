package co.istad.genericType.oop;

public class Student extends Person{
    private Double score;

    public Student(){}

    public Student(String name, String g, Float height, Double score) {
        super(name, g, height);
        this.score = score;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
