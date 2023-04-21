package package1;

public class Test {
    public static void main(String args[]){
        ChildClass reference1 = new ChildClass();
        reference1.assignValueParent(3);
        System.out.println("Value : "+reference1.parentInt1);

        ParentClass reference2 = new ParentClass();
        reference2.assignValueParent(3);
        System.out.println("Value : "+reference2.parentInt1);

        ParentClass reference3 = new ChildClass();
        reference3.assignValueParent(3);
        System.out.println("Value : "+reference3.parentInt1);

        ParentClass reference4 = new ChildClass();
        reference4.
    }
}
