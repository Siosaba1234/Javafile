package test;

public class Test3 {

    public static void main(String[] args) {
        // 九九の表を表示
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                // 九九の計算結果を表示
                System.out.println(i + " × " + j + " = " + (i * j) + "\t");
            }
            // 改行
            System.out.println();
        }
    }
}
