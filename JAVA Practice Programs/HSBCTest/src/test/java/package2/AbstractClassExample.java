package package2;

public abstract class AbstractClassExample {
    protected int intA;
    protected int intB;

    public AbstractClassExample(){
        intA = 10;
        intB = 20;
    }

    public int addIntegers() {
        return intA+intB;
    }

    protected abstract double area();
}
