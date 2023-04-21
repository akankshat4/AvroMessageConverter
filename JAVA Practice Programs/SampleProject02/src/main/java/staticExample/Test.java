package staticExample;

public class Test {

    public static void main(String args[]){
        StaticExampleClass object1 = new StaticExampleClass();
        StaticExampleClass object2 = new StaticExampleClass();

        object1.incrementStatic();
        object1.incrementNonStatic();

        System.out.println("Object 1 Non Static : "+object1.nonStaticInt);
        System.out.println("Static Int: "+StaticExampleClass.staticInt);

        object2.incrementNonStatic();
        object2.incrementStatic();

        System.out.println("Object 2 Non Static : "+object1.nonStaticInt);
        System.out.println("Static Int: "+StaticExampleClass.staticInt);


    }
}
