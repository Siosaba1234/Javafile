package test;
import java.util.Scanner;

public class Test15_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 整数1の入力
            System.out.print("整数1 = ");
            int num1 = scanner.nextInt();

            // 整数2の入力
            System.out.print("整数2 = ");
            int num2 = scanner.nextInt();

            // 割り算の結果を表示
            double result = divideNumbers(num1, num2);
            System.out.println(num1 + " / " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            // 0で割った場合の例外処理
            System.out.println("0による割り算です！！");
        } finally {
            // プログラムの終了処理
            System.out.println("処理終了");
            scanner.close();
        }
    }

    // 割り算を行うメソッド
    private static double divideNumbers(int num1, int num2) {
        if (num2 == 0) {
            // 0で割る場合は例外をスロー
            throw new ArithmeticException("0除算例外");
        }
        return (double) num1 / num2;
    }
}
