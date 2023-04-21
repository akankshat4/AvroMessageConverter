package session2.package2;

import session2.package1.ParentClass;

public class ChildClassDifferentPackage extends ParentClass {
    public void assignValues(){
        super.publicIntVariable = 150;
        super.protectedIntVariable = 200;
        //super.privateIntVariable = 580;
        //super.defaultIntVariable = 690;
    }

}
