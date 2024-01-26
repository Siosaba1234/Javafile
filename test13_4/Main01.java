package test13_4;

import java.util.Scanner;

// メインクラス
public class Main01 {
    public static void main(String[] args) {
        // CalcExecutor クラスのインスタンスを生成
        CalcExecutor calcExecutor = new CalcExecutor();

        // ユーザーに整数の入力を促す
        Scanner scanner = new Scanner(System.in);

        System.out.print("１個目の整数を入力してください：");
        double num1 = scanner.nextDouble();

        System.out.print("２個目の整数を入力してください：");
        double num2 = scanner.nextDouble();

        // 足し算と引き算の結果を表示
        double additionResult = calcExecutor.add(num1, num2);
        double subtractionResult = calcExecutor.subtract(num1, num2);

        System.out.println("足し算の結果：" + additionResult);
        System.out.println("引き算の結果：" + subtractionResult);

        // 掛け算と割り算の結果を表示
        double multiplicationResult = calcExecutor.multiply(num1, num2);
        double divisionResult = calcExecutor.divide(num1, num2);

        System.out.println("掛け算の結果：" + multiplicationResult);
        System.out.println("割り算の結果：" + divisionResult);
    }
}
