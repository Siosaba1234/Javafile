package test;

public class Tasizann1 {
    
    public static void main(String[] args) {
            // 合計を格納する変数
        int sum = 0;
    
            // 1から100までの数を加算
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
    
            // 合計を画面に表示
        System.out.println("1から100までの合計: " + sum);
    }
}
    