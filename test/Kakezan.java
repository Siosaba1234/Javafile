package test;
public class Kakezan {
    public static void main(String[] args) {
        // 九九の式を1行ずつ表示
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " × " + j + " = " + (i * j));
            }
        }
    }
}

