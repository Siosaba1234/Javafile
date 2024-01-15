package test;

public class Kakunou {
    

    public static void main(String[] args) {
        // 長さが10の整数型配列を作成
        int[] numbers = new int[10];

        // 配列に1から10までの値を格納
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // 配列内の値を画面に表示
        System.out.println("配列内の値を表示します:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

