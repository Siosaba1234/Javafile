package pokemon;

public class LegendPokemon extends Pokemon {
    private boolean isLegendary;

    public LegendPokemon(String name, String type, int level, String Characteristic, boolean isLegendary) {
        super(name, type, level, Characteristic);
        this.isLegendary = isLegendary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("伝説のポケモン: " + (isLegendary ? "はい" : "いいえ"));
    }
}
