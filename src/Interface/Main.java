package Interface;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(1,2));
        System.out.println(calc.multiply(0, 0));

        if (calc instanceof Calculator) {
            Calculator myCalc = (Calculator) calc;
            System.out.println(myCalc.add(2.0, 3.0));
        }


    }
}
