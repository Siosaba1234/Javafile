package test;
import java.util.Scanner;
public class Test2 {

    public static void main(String[] args) {
        // Scannerを使用してユーザーからの入力を受け取る
        Scanner scanner = new Scanner(System.in);

        // メッセージを表示してユーザーに入力を促す
        System.out.print("A～D の値を入力してください：");
        char inputRank = scanner.next().charAt(0);

        // 入力されたランクに対応するメッセージを表示
        switch (inputRank) {
            case 'A':
                System.out.println("ランク A は評価「優」です");
                break;
            case 'B':
                System.out.println("ランク B は評価「良」です");
                break;
            case 'C':
                System.out.println("ランク C は評価「可」です");
                break;
            case 'D':
                System.out.println("ランク D は評価「不可」です");
                break;
            default:
                System.out.println("無効なランクです");
        }

        // Scannerを閉じる
        scanner.close();
    }
}
