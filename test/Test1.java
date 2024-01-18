package test;

public class Test1 {
    public static void main(String[] args) {
        // 円周率を定義
        final double PI = 3.14;

        // 半径を指定
        double radius = 3.0;

        // 円の面積を計算
        double area = PI * radius * radius;

        // 結果を画面に表示
        System.out.println("半径が " + radius + " の円の面積は: " + area);
    }
}
