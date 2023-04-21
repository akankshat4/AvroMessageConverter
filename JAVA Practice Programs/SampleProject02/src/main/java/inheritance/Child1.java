package inheritance;

public class Child1 extends ParentClass{
    public int child1Int1;
    public int child1Int2;
    public int commonVariable;
    public int independentChild1Variable;

    public Child1 (int a, int b){
        System.out.println("Child class constructor");
        child1Int1 = a;
        child1Int2 = b;
    }

    public Child1(int a, int b, int c, int d){
        super(c, d);
        super.commonVariable = a;
        this.commonVariable = b;
    }

    public int getParentClassCommonVariable(){
        return super.commonVariable;
    }
}
