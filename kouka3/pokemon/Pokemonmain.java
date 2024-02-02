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
                    case "ピカチュウ":
                        Pokemon pikachu = new Pokemon("ピカチュウ", "でんき", 25 , "せいでんき");
                        displayPokemonDetails(pikachu);
                        break;

                    case "ミュウツー":
                        LegendPokemon mewtwo = new LegendPokemon("ミュウツー", "エスパー", 70,"プレッシャー", true);
                        displayPokemonDetails(mewtwo);
                        break;

                    case "ヒトカゲ":
                        EvolvablePokemon hitokage = new EvolvablePokemon("ヒトカゲ", "ほのお", 5,"もうか", "リザードン");
                        displayPokemonDetails(hitokage);
                        break;

                    case "ヌメルゴン":
                        RegionPokemon numerugon = new RegionPokemon("ヌメルゴン（ヒスイの姿）", "はがね、ドラゴン", 50,"そうしょく、シェルアーマー", "ヒスイ地方");
                        displayPokemonDetails(numerugon);
                        break;


                    default:
                        System.out.println("無効なポケモンの種類です。");
              }

                System.out.println("続けてポケモンを入力しますか？ (y/n):");
                String continueInput = scanner.nextLine();
                if (!continueInput.equalsIgnoreCase("y")) {
                    System.out.println("終了します。");
                    break; // ユーザーが続けない場合はループを抜ける
            }


           
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
