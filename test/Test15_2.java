package test;

import java.util.Scanner;

public class Test15_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 整数の入力を促す
            System.out.print("整数を入力 = ");
            
            // 整数かどうかを判定
            if (scanner.hasNextInt()) {
                int userInput = scanner.nextInt();

                // 偶数か奇数かを判定して表示
                if (userInput % 2 == 0) {
                    System.out.println(userInput + " は偶数");
                } else {
                    System.out.println(userInput + " は奇数");
                }
            } else {
                // 整数でない場合のメッセージ
                System.out.println("整数と認識できません！！");
            }
        } finally {
            scanner.close();
        }
    }
}
