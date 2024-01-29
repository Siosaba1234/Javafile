package test;
import java.util.Scanner;

public class Test14_3 {
    public static void main(String[] args) {
        // ユーザからの入力を受け取る
        Scanner scanner = new Scanner(System.in);
        System.out.print("文字列を入力：");
        String inputString = scanner.nextLine();

        // StringBuilderを使って新しい文字列を生成
        StringBuilder resultStringBuilder = new StringBuilder();

        // 入力文字列の長さが11文字以上の場合は、11文字までの部分を取り出す
        if (inputString.length() >= 11) {
            resultStringBuilder.append(inputString.substring(0, 10));
        } else {
            resultStringBuilder.append(inputString);
        }

        // 結果を表示
        System.out.println("結果文字列：" + resultStringBuilder.toString());
    }
}
