package test;
import java.util.Scanner;
public class Kakunou2 {

    public static void main(String[] args) {
        // Scannerを使用してユーザーからの入力を受け取る
        Scanner scanner = new Scanner(System.in);

        // 10件の整数値を入力
        int[] numbers = new int[10];
        System.out.println("10件の整数値を入力してください:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("値 " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // 偶数値の要素と奇数値の要素を格納する配列を作成
        int[] evenArray = new int[10];
        int[] oddArray = new int[10];
        int evenCount = 0;
        int oddCount = 0;

        // 入力された値を偶数と奇数で分ける
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenArray[evenCount++] = number;
            } else {
                oddArray[oddCount++] = number;
            }
        }

        // 偶数値の要素を表示
        System.out.println("偶数値の要素を表示します:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }

        // 改行
        System.out.println();

        // 奇数値の要素を表示
        System.out.println("奇数値の要素を表示します:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }

        // Scannerを閉じる
        scanner.close();
    }
}
