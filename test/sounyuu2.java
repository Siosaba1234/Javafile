package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class sounyuu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("文字を入力してください: ");
            String userInputString = scanner.nextLine();

            System.out.print("整数を入力してください: ");
            int userInputNumber = scanner.nextInt();

            scanner.nextLine(); // 改行を読み飛ばす

            System.out.print("小数を入力してください: ");
            double userInputDouble = scanner.nextDouble();

            System.out.println("入力された文字: " + userInputString);
            System.out.println("入力された整数: " + userInputNumber);
            System.out.println("入力された小数: " + userInputDouble);
        } catch (InputMismatchException e) {
            System.out.println("入力が期待される形式ではありません。");
        } finally {
            scanner.close();
        }
    }
}

