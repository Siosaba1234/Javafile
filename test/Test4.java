package test;

public class Test4 {
    public static void main(String[] args) {
        // 合計が100,000を超えるnを見つける
        int n = 1;
        int sum = 0;

        while (sum <= 100000) {
            sum += n;
            n++;
        }

        // 結果を表示
        System.out.println("合計が100,000を超えるnは: " + (n - 1));
    }
}

