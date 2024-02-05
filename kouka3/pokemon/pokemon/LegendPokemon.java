package pokemon;
// Xtendsで継承
public class LegendPokemon extends Pokemon {
    private boolean isLegendary;
// legendPokemonに必要ななまえ、タイプ、出現レベル、特性、伝説のポケモンかどうかを聞く
    public LegendPokemon(String name, String type, int level, String Characteristic, boolean isLegendary) {
        super(name, type, level, Characteristic);
        this.isLegendary = isLegendary;
    }
//継承する
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("伝説のポケモン: " + (isLegendary ? "はい" : "いいえ"));
    }
}
