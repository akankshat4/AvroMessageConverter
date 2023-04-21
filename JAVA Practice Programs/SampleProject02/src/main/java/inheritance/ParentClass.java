package inheritance;

public class ParentClass {
    public int patentClassInt1;
    public int patentClassInt2;
    public int commonVariable;

    public ParentClass(){
        System.out.println("Parent class constructor");
        patentClassInt1 = 100;
        patentClassInt2 = 101;
    }

    public ParentClass(int a, int b){
        System.out.println("Parent class parameterised constructor");
        patentClassInt1 = a;
        patentClassInt2 = b;
    }

    public void method1(){

    }
}
