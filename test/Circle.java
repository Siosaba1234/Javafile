package test;
import java.util.Scanner;

public class Circle {
    // 円周率を定義
    private static final double PI = 3.1415;
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        // 円周の長さを計算
        double circumference = 2 * PI * radius;
        return circumference;
    }

    public double calculateArea() {
        // 円の面積を計算
        double area = PI * Math.pow(radius, 2);
        return area;
    }

    public static void main(String[] args) {
        // ユーザーから半径を入力
        Scanner scanner = new Scanner(System.in);
        System.out.print("半径を整数値で入力：");
        double radius = scanner.nextDouble();

        // Circleクラスのインスタンスを作成
        Circle circleInstance = new Circle(radius);

        // 円周の長さを計算して表示
        double circumferenceResult = circleInstance.calculateCircumference();
        System.out.printf("円周の長さは %.3f です。\n", circumferenceResult);

        // 円の面積を計算して表示
        double areaResult = circleInstance.calculateArea();
        System.out.printf("円の面積は %.3f です。\n", areaResult);
    }
}
