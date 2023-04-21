package inheritance;

public class Test {
    public static void main(String args[]){
       /* Child1 child1 = new Child1(30, 35);

        System.out.println(" Parent Class Variables ");
        System.out.println("patentClassInt1 : "+child1.patentClassInt1);
        System.out.println("patentClassInt2 : "+child1.patentClassInt2);*/

        Child1 child1Obj2 = new Child1(30, 35, 40, 45);

        System.out.println("Common Variable Child Class : "+child1Obj2.commonVariable);
        System.out.println("Common Variable Parent Class: "+child1Obj2.getParentClassCommonVariable());
    }
}
