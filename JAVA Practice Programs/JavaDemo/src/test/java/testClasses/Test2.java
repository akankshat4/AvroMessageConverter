package testClasses;

public class Test2 {
    public static void main(String args[]){
        Calculator object1 ;
        object1 = new Calculator();
        object1.intA = 10;
        object1.intB = 20;
        System.out.println("Object 1.intA :"+object1.intA);
        System.out.println("Object 1.intB :"+object1.intB);
        object1.add();
        System.out.println("Object 1.intC : "+object1.intC);

        Calculator object2 ;
        object2 = new Calculator();
        object1.intA = 80;
        object2.intB = 90;
        object2.add();
        System.out.println("Calculator : "+object2.intC);

        System.out.println("Object 2.intA :"+object2.intA);
        System.out.println("Object 2.intB :"+object2.intB);
    }
}
