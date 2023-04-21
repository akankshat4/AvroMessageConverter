package session2.package1;

public class ParentClass {

    public int publicIntVariable;
    int defaultIntVariable;
    protected int protectedIntVariable;
    private int privateIntVariable;

    public void assignValues(){
        defaultIntVariable = 30;
        protectedIntVariable = 40;
        publicIntVariable = 50;
        privateIntVariable = 60;
    }

    public static void main (String args[]){
        ParentClass parentClass = new ParentClass();
        parentClass.assignValues();
        System.out.println("private variable : "+parentClass.privateIntVariable);
    }
}
