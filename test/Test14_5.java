package test;
import java.util.Scanner;

public class Test14_5 {
    public static void main(String[] args) {
        // Scannerクラスを使用してユーザーに入力を受け取る
        Scanner scanner = new Scanner(System.in);

        // 内容1の入力を受け取る
        System.out.print("内容1を入力してください: ");
        String content1 = scanner.nextLine();

        // 内容2の入力を受け取る
        System.out.print("内容2を入力してください: ");
        String content2 = scanner.nextLine();

        // StringBuilderクラスを使用して文字列を結合
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(content1).append(" ").append(content2);

        // 結合された文字列を画面に表示　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　
        System.out.println("結合された文字列: " + stringBuilder.toString());

        // Scannerを閉じる
        scanner.close();
    }
}
