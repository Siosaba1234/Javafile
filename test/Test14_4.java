package test;

import java.util.Scanner;

public class Test14_4 {
    public static void main(String[] args) {
        // ユーザからの入力を受け取る
        Scanner scanner = new Scanner(System.in);

        System.out.println("文字列を2つ入力してください。");

        System.out.print("1つ目文字列を入力：");
        String firstString = scanner.nextLine();

        System.out.print("2つ目文字列を入力：");
        String secondString = scanner.nextLine();

        // 文字列の比較
        if (firstString.equals(secondString)) {
            System.out.println("同じ文字列です。");
        } else {
            System.out.println("違う文字列です。");
        }
    }
}
