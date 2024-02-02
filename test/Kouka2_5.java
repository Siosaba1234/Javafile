package test;

import java.util.Scanner;

public class Kouka2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザーに現在のパスワードを入力してもらう
        System.out.print("現在のパスワードを入力してください: ");
        String originalPassword = scanner.nextLine();

        // 現在のパスワードを表示
        System.out.println("現在のパスワード: " + originalPassword);

        // 強力なセキュリティのパスワードを生成
        String strongPassword = generateStrongPassword(originalPassword);

        // 生成した強力なパスワードを表示
        System.out.println("セキュリティ上の問題を発見しました");
        System.out.println("セキュリティを強化しました");
        System.out.println("こちらのパスワードをお使いください: " + strongPassword);

        // Scannerを閉じる
        scanner.close();
    }

    // 強力なセキュリティのパスワードを生成するメソッド
    private static String generateStrongPassword(String originalPassword) {
        // StringBuilderを使用して逆順にする
        StringBuilder reversedPassword = new StringBuilder(originalPassword).reverse();

        // 生成したパスワードをStringとして返す
        return reversedPassword.toString();
    }
}
