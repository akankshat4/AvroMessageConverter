package package1;

public class PracticeClassObjects {
    int number ;
    float floatingNumber;
    double doubleNumber;
    String string;
    boolean booleanVariable;

    public int getNumber() {
        return number;
    }

    public float getFloatingNumber() {
        return floatingNumber;
    }

    public double getDoubleNumber() {
        return doubleNumber;
    }

    public String getString() {
        return string;
    }

    public boolean isBooleanVariable() {
        return booleanVariable;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setFloatingNumber(float floatingNumber) {
        this.floatingNumber = floatingNumber;
    }

    public void setDoubleNumber(double doubleNumber) {
        this.doubleNumber = doubleNumber;
    }

    public void setString(String string1) {
        System.out.println("Value of variable inside setStringMethod : "+string1);
        this.string = string1;
    }

    public void setBooleanVariable(boolean booleanVariable) {
        this.booleanVariable = booleanVariable;
    }
}
