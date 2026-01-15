package co.istad.genericType;

//this generic type T is bounded(Upper bounded) with "extends" so generic type nis min men jes te dak ban te trv te dak type del jea sub class of the class "Number"
public class Calculator <T extends Number>{
    private T v1;
    private T v2;

    public T getV1() {
        return v1;
    }

    public void setV1(T v1) {
        this.v1 = v1;
    }

    public T getV2() {
        return v2;
    }

    public void setV2(T v2) {
        this.v2 = v2;
    }
}
