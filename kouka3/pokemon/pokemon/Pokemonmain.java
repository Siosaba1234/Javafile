package pokemon;
import java.util.Scanner;

public class Pokemonmain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("ポケモンの種類を選んでください（ピカチュウ、ミュウツー、ヒトカゲ、ヌメルゴン）:");
                String pokemonType = scanner.nextLine();

                switch (pokemonType) {
                    // ピカチュウと入力された場合表示するもの
                    case "ピカチュウ":
                        Pokemon pikachu = new Pokemon("ピカチュウ", "でんき", 25 , "せいでんき");
                        displayPokemonDetails(pikachu);
                        break;
                    // ミュウツーと入力された場合表示するもの
                    case "ミュウツー":
                        LegendPokemon mewtwo = new LegendPokemon("ミュウツー", "エスパー", 70,"プレッシャー", true);
                        displayPokemonDetails(mewtwo);
                        break;
                    // ヒトカゲと入力された場合表示するもの
                    case "ヒトカゲ":
                        EvolvablePokemon hitokage = new EvolvablePokemon("ヒトカゲ", "ほのお", 5,"もうか", "リザードン");
                        displayPokemonDetails(hitokage);
                        break;
                    // ヌメルゴンと入力された場合表示するもの
                    case "ヌメルゴン":
                        RegionPokemon numerugon = new RegionPokemon("ヌメルゴン（ヒスイの姿）", "はがね、ドラゴン", 50,"そうしょく、シェルアーマー", "ヒスイ地方");
                        displayPokemonDetails(numerugon);
                        break;

                    // もし間違ったポケモンを打った際に表示するもの
                    default:
                        System.out.println("無効なポケモンの種類です。");
              }
            //   続けてポケモンを入力するか聞く
                System.out.println("続けてポケモンを入力しますか？ (はい・いいえ):");
                String continueInput = scanner.nextLine();
                if (!continueInput.equalsIgnoreCase("はい")) {//はいと入力された場合にはまた繰り返す
                    System.out.println("終了します。");//いいえもしくは打ち間違えがあった場合に終了させる
                    break; // ユーザーが続けない場合はループを抜ける
            }


        //    例外処理
            } catch (Exception e) {
                System.err.println("予期せぬエラーが発生しました: " + e.getMessage());
            }
        }
    }
    private static void displayPokemonDetails(DetailDisplayable pokemon) {
        System.out.println("=== ポケモンの詳細 ===");
        pokemon.displayDetails();
        System.out.println("=======================");
    }
}
