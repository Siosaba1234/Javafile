package test;
import java.util.Scanner;
class Jikkou2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザーが入力した値を取得
        System.out.print("x の値を入力してください: ");
        int x = scanner.nextInt();
        System.out.print("y の値を入力してください: ");
        int y = scanner.nextInt();

        // クラス変数 x, y に値を代入
        OperationExecutor.x = x;
        OperationExecutor.y = y;

        // 合計値を求めるメソッドを呼び出し
        int result = OperationExecutor.calculateSum();

        // 結果を出力
        System.out.printf("%d から %d までの合計値は %d です。\n", OperationExecutor.x, OperationExecutor.y, result);
    }
}