package test;

class OperationExecutor {
    static int x; // クラス変数 x
    static int y; // クラス変数 y

    static int calculateSum() {
        // x から y までの合計値を求めるメソッド
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }
}