package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test15_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // ユーザに整数を入力してもらう
            System.out.print("整数を入力 = ");
            int inputNumber = scanner.nextInt();

            // 入力が偶数か奇数かを判定して表示する
            if (inputNumber % 2 == 0) {
                System.out.println(inputNumber + " は偶数");
            } else {
                System.out.println(inputNumber + " は奇数");
            }

        } catch (InputMismatchException e) {
            System.out.println("整数と認識できません！！");
        } finally {
            scanner.close();
        }
    }
}

