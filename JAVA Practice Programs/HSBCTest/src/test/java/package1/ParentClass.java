package package1;

public class ParentClass {
    public int parentInt1;

    public void assignValueParent(int a){
        parentInt1 = a;
    }

    public void assignValueParent(int a, int b){
        parentInt1 = a;
    }

    public void parentClassMethod(){
        System.out.println("Parent Class method");
    }
}
