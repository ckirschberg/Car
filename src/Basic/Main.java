package Basic;

public class Main {
    public static void main(String[] hi) {
        // type/class name = new class();
        // Create an object
        GarbageMan g1 = new GarbageMan("Brian", 80000);
        GarbageMan g2 = new GarbageMan("Douglas", 15000);

        // objectName.methodName(parameter values)
        System.out.println(g1.getFirstName());
        System.out.println(g1.getSalary());
        System.out.println("---------------");
        System.out.println(g2.getFirstName());
        System.out.println(g2.getSalary());

    }
}
