public class Main {

    public static void main(String[] args) {
        Ints calculator = new IntsCalculator();
        System.out.println(calculator.sum(2, 2));
        System.out.println(calculator.mult(10, 22));
        System.out.println(calculator.pow(2, 10));
        System.out.println(calculator.div(10, 25));
        System.out.println(calculator.sub(10, 22));
    }
}
