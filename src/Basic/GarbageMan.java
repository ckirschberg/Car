package Basic;

public class GarbageMan {
    // private because we need encapsulation.
    private String firstName;
    private int salary;

    // public *name of the class* -> Makes it the constructor
    public GarbageMan(String first, int hisSalary) {
        setFirstName(first);
        setSalary(hisSalary);
    }

    public boolean isItAGoodSalary() {
        if (getSalary() >= 80000) {
            return true;
        }
        return false;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int s) {
        salary = s;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        //if (firstName.equals("")) {
            //System.out.println("Not allowed");
        //}else {
            this.firstName = firstName;
        //}
    }


}
