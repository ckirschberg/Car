public class TriangleCalc implements ITriangle
{
    public static void main(String[] args) {
        ITriangle triCalc = new TriangleCalc();
        System.out.println(triCalc.area(3,5));
        //System.out.println(triCalc.calculateAngle(2,4));
    }

   public double area(double a, double b) {
       return a*b/2;
   }

   public double cLength(double a, double b) {
       return Math.sqrt(Math.pow(a, 2) +
               Math.pow(b, 2));
   }
   public double calculateAngle(double a, double b) {
        return a+b;
   }
}
