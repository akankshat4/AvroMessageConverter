package staticExample;

public class StaticExampleClass {
    public static int staticInt;
    public int nonStaticInt;

    public void incrementStatic(){
        staticInt++;
    }

    public void incrementNonStatic(){
        nonStaticInt++;
    }
}
