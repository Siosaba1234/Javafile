package pokemon;
//privateにポケモンの属性を格納する
public class Pokemon implements DetailDisplayable {
    private String name; //
    private String type; //
    private int level;   //
    private String Characteristic; //
//初期化する
    public Pokemon(String name, String type, int level ,String Characteristic) {
        this.name = name;
        this.type = type; 
        this.level = level;
        this.Characteristic = Characteristic;
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
        return Characteristic;
    }
//オーバーライドで継承する
    @Override
    public void displayDetails() {
        System.out.println("名前: " + name);
        System.out.println("タイプ: " + type);
        System.out.println("レベル: " + level);
        System.out.println("特性: " + Characteristic);

    }
}