import java.math.BigDecimal;
import java.math.RoundingMode;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return doubleForInt(target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result());
    }

    @Override
    public int sub(int arg0, int arg1) {
        return doubleForInt(target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUB)
                .result());
    }

    @Override
    public int mult(int arg0, int arg1) {
        return doubleForInt(target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result());
    }

    @Override
    public double div(int arg0, int arg1) {
        return  new BigDecimal(target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.DIV)
                .result())
                .setScale(2,RoundingMode.HALF_EVEN).doubleValue();
    }

    @Override
    public int pow(int a, int b) {
        return doubleForInt(target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result());
    }

    public int doubleForInt(double dx) {
        double newDx = new BigDecimal(dx).setScale(0, RoundingMode.HALF_EVEN)
                .doubleValue();

        return (int) newDx;
    }
}
