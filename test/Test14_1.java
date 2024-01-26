package test;

import java.util.Scanner;

public class Test14_1 {
    public static void main(String[] args) {
        // ユーザーに文字列の入力を促す
        Scanner scanner = new Scanner(System.in);
        System.out.print("文字列を入力：");
        String inputString = scanner.nextLine();

        // 入力された文字列をそのまま新しい文字列として使用
        String resultString = generateNewString(inputString);

        // 結果を画面に表示
        System.out.println(resultString);
    }

    // 新しい文字列を生成するメソッド
    private static String generateNewString(String inputString) {
        // 入力された文字列をそのまま新しい文字列として使用
        return inputString;
    }
}
