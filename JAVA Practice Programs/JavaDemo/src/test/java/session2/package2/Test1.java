package session2.package2;

import session2.package1.ChildClassSamePackage;
import session2.package1.ParentClass;

public class Test1 {
    public static void main(String args[]){
        ParentClass parentClass = new ParentClass();
        parentClass.assignValues();
        System.out.println("*************Parent Class object created in runner class of same package");
        //System.out.println("Default Variable :"+parentClass.defaultIntVariable);
        //System.out.println("Private Variable :"+parentClass.privateIntVariable);
        //System.out.println("Protected Variable :"+parentClass.protectedIntVariable);
        System.out.println("public Variable :"+parentClass.publicIntVariable);
    }
}
