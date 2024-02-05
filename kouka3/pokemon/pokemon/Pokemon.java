package pokemon;
//privateにポケモンの属性を格納する
public class Pokemon implements DetailDisplayable {
    private String name; //名前
    private String type; //タイプ
    private int level;   //レベル
    private String characteristic; //特性
//初期化する
    public Pokemon(String name, String type, int level ,String characteristic) {
        this.name = name;
        this.type = type; 
        this.level = level;
        this.characteristic = characteristic;
    }
//ポケモンの名前を得るゲッターメソッド
    public String getName() {
        return name;
    }
//ポケモンのタイプを得るゲッターメソッド
    public String getType() {
        return type;
    }
//ポケモンが出現するレベルを得るゲッターメソッド
    public int getLevel() {
        return level;
    }
//ポケモンの特性を得るゲッターメソッド
    public String getCharacteristic(){
        return characteristic;
    }
//オーバーライドで継承する
    @Override
    public void displayDetails() {
        System.out.println("名前: " + name);
        System.out.println("タイプ: " + type);
        System.out.println("レベル: " + level);
        System.out.println("特性: " + characteristic);

    }
}