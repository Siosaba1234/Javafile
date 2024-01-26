package test;
import java.util.Scanner;

public class Test14_2 {
    public static void main(String[] args) {
        // ユーザーに文字列の入力を促す
        Scanner scanner = new Scanner(System.in);
        System.out.print("文字列を入力：");
        String inputString = scanner.nextLine();

        // 入力された文字列から新しい文字列を生成
        String generatedString = generateNewString(inputString);

        // 生成された文字列の文字数を表示
        int characterCount = countCharacters(generatedString);
        System.out.println("入力された文字数は " + characterCount + " です。");
    }

    // 新しい文字列を生成するメソッド
    private static String generateNewString(String inputString) {
        // ここで新しい文字列の生成ロジックを実装
        // この例では元の文字列をそのまま使用
        return inputString;
    }

    // 文字列の文字数を数えるメソッド
    private static int countCharacters(String inputString) {
        return inputString.length();
    }
}

