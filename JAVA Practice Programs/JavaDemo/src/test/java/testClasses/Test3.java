package testClasses;

public class Test3 {
    public static void main(String args[]){
        Calculator object3 = new Calculator();
        object3.intA = 10;
        object3.intB = 20;
        object3.add();
        System.out.println("Object 3.intA :"+object3.intA);//10
        System.out.println("Object 3.intB :"+object3.intB);//20
        System.out.println("Object 3.intC : "+object3.intC);//30

        Calculator object4;
        object4 = object3;
        object4.intA = 50;
        System.out.println("********* Object 3*********");
        System.out.println("Object 3.intA :"+object3.intA);//50
        System.out.println("Object 3.intB :"+object3.intB);//20
        System.out.println("Object 3.intC : "+object3.intC);//30

        object3.add();

        System.out.println("********* Object 4*********");
        System.out.println("Object 4.intA :"+object4.intA);//50
        System.out.println("Object 4.intB :"+object4.intB);//20
        System.out.println("Object 4.intC : "+object4.intC);//70

        System.out.println("********* Object 3*********");
        System.out.println("Object 3.intA :"+object3.intA);//50
        System.out.println("Object 3.intB :"+object3.intB);//20
        System.out.println("Object 3.intC : "+object3.intC);//70
    }
}
