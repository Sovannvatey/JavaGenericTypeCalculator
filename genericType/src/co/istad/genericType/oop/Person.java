package co.istad.genericType.oop;

public class Person {
    private String name;
    private String g;
    private Float height;

    public Person(){}

    public Person(String name, String g, Float height) {
        this.name = name;
        this.g = g;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }
}
