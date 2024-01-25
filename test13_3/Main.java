package test13_3;

// メインクラス
public class Main {
    public static void main(String[] args) {
        // Teacher クラスのインスタンスを生成して情報を表示
        Teacher teacherInstance = new Teacher("竹井一馬", "教員", "情報処理");
        System.out.println("=== 教員の情報 ===");
        teacherInstance.introduce();
        System.out.println();

        // Cook クラスのインスタンスを生成して情報を表示
        Cook cookInstance = new Cook("大原太郎", "シェフ", "オムライス");
        System.out.println("=== シェフの情報 ===");
        cookInstance.introduce();
    }
}
