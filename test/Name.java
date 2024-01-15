package test;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        // Scannerを使用してユーザーからの入力を受け取る
        Scanner scanner = new Scanner(System.in);

        // 学校名の入力を促すメッセージを表示
        System.out.print("学校名を入力してください: ");
        String schoolName = scanner.nextLine();

        // 名前の入力を促すメッセージを表示
        System.out.print("名前を入力してください: ");
        String userName = scanner.nextLine();

        // 入力された学校名と名前を表示する関数を呼び出し
        displaySchoolAndName(schoolName, userName);

        // Scannerを閉じる
        scanner.close();
    }

    // 学校名と名前を表示する関数
    public static void displaySchoolAndName(String school, String name) {
        System.out.println("学校名: " + school);
        System.out.println("名前: " + name);
    }
}

