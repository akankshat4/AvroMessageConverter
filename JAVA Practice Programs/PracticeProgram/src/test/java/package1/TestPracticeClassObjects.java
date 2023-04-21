package package1;

public class TestPracticeClassObjects {
    public static void main(String args[]){
        PracticeClassObjects objects = new PracticeClassObjects() ;
        System.out.println("Default value");
        System.out.println("Number : "+objects.getNumber());
        System.out.println("Float : "+objects.getFloatingNumber());
        System.out.println("Double : "+objects.getDoubleNumber());
        System.out.println("String : "+objects.getString());
        System.out.println("Boolean : "+objects.isBooleanVariable());

        objects.setNumber(15);
        objects.setBooleanVariable(true);
        objects.setDoubleNumber(30.125);
        objects.setFloatingNumber(18.695f);
        objects.setString("Akanksha Tomar");

        System.out.println("Manually Entered value");
        System.out.println("Number : "+objects.getNumber());
        System.out.println("Float : "+objects.getFloatingNumber());
        System.out.println("Double : "+objects.getDoubleNumber());
        System.out.println("String : "+objects.getString());
        System.out.println("Boolean : "+objects.isBooleanVariable());

        PracticeClassObjects objects1 = objects;
        objects1.setString("Divya Solanki");

        System.out.println("String updated using different reference: "+objects.getString());


    }
}
