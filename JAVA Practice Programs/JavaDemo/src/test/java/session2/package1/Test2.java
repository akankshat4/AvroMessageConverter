package session2.package1;

public class Test2 {
    public static void main(String args[]){
        ParentClass parentClass = new ParentClass();
        parentClass.assignValues();
        System.out.println("*************Parent Class object created in runner class of same package");
        System.out.println("Default Variable :"+parentClass.defaultIntVariable);
        //System.out.println("Private Variable :"+parentClass.privateIntVariable);
        System.out.println("Protected Variable :"+parentClass.protectedIntVariable);
        System.out.println("public Variable :"+parentClass.publicIntVariable);

        ChildClassSamePackage childClassSamePackage = new ChildClassSamePackage();
        childClassSamePackage.assignValues();
        System.out.println("*********************Child Class of Same package*********************");
        System.out.println("Public Variable of parent class :"+childClassSamePackage.publicIntVariable);
        System.out.println("Protected Variable of parent class :"+childClassSamePackage.protectedIntVariable);
        System.out.println("Private Variable of parent class : "+childClassSamePackage.privateIntVariable);
        System.out.println("Default Variable of parent class"+childClassSamePackage.defaultIntVariable);
    }
}
