package pokemon;

// Xtendsで継承する
public class EvolvablePokemon extends Pokemon {
    private String evolutionStage;
// EvolvablePokemonに必要ななまえ、タイプ、出現レベル、特性、進化先を聞く
    public EvolvablePokemon(String name, String type, int level,String Characteristic, String evolutionStage) {
        super(name, type, level, Characteristic);
        this.evolutionStage = evolutionStage;
    }
// オーバーライドで継承する
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("進化先: " + evolutionStage);
    }
}
