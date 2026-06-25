public class Calculator {
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public double sum(double a, double b){
        return a+b;
    }

}
class calMain{
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        cal.sum(2.1, 2.6);
        System.out.println(cal.sum(1, 2, 3));

    }
}
