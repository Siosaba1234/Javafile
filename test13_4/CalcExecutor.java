package test13_4;
// CalcExecutor クラスの定義
class CalcExecutor implements CalcAddSub, CalcMultiDiv {
    @Override
    public double add(double inNum1, double inNum2) {
        return  inNum1 + inNum2;
    }

    @Override
    public double subtract(double inNum1, double inNum2) {
        return inNum1 - inNum2;
    }

    @Override
    public double multiply(double inNum1, double inNum2) {
        return inNum1 * inNum2;
    }

    @Override
    public double divide(double inNum1, double inNum2) {
        if (inNum2 != 0) {
            return inNum1 / inNum2;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN; // NaN (Not a Number) to indicate an error
        }
    }
}