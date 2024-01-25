package test;
import java.util.Scanner;

class Calculator {
    public int calcSum(int a, int b) {
        return a + b;
    }

    public double calcAve(int a, int b) {
        return (a + b) / 2.0;
    }
}

class MoreCalc extends Calculator {
    public double calcPow(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 整数を入力
        System.out.print("整数を入力してください：");
        int num1 = scanner.nextInt();

        System.out.print("整数を入力してください：");
        int num2 = scanner.nextInt();

        // MoreCalc クラスのインスタンスを生成
        MoreCalc moreCalc = new MoreCalc();

        // 合計値を計算して表示
        int sum = moreCalc.calcSum(num1, num2);
        System.out.println("Sum " + num1 + " and " + num2 + " = " + sum);

        // 平均値を計算して表示
        double ave = moreCalc.calcAve(num1, num2);
        System.out.println("Average " + num1 + " and " + num2 + " = " + ave);

        // 累乗を計算して表示
        int exponent = 4;
        double powResult = moreCalc.calcPow(num1, exponent);
        System.out.println("Power " + num1 + " of " + exponent + " = " + powResult);
    }
}
