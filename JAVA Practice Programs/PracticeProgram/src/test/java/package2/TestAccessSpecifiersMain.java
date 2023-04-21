package package2;

import package1.AccessSpecifiers;

public class TestAccessSpecifiersMain {
    public static void main(String args[]){
        AccessSpecifiersChild accessSpecifiersChild = new AccessSpecifiersChild();
        accessSpecifiersChild.setProtectedInt(100);
        System.out.println("Protected Int value : "+accessSpecifiersChild.getProtectedInt());

        AccessSpecifiers accessSpecifiers = new AccessSpecifiers();

    }
}
