package test;

public class Keisan2 {

        public static void main(String[] args) {
            // 合計を格納する変数を初期化
            int total = 0;
    
            // 1から100までの整数を合計する
            int i = 1;
            do {
                total += i;
                i++;
            } while (i <= 100);
    
            // 合計を画面に表示
            System.out.println("1から100までの整数の合計は: " + total);
        }
    }
    

