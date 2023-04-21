package package1;

public class TestAccessSpecifiers {
    public static void main(String args[]){
        AccessSpecifiers accessSpecifiers = new AccessSpecifiers();
        accessSpecifiers.protectedInt = 56;
        System.out.println("Protected Int : "+accessSpecifiers.protectedInt);

        accessSpecifiers.defaultNumber = 150;
        System.out.println("Default Number : "+accessSpecifiers.defaultNumber);
    }
}
