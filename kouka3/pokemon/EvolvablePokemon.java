package pokemon;
// ファイル: EvolvablePokemon.java


public class EvolvablePokemon extends Pokemon {
    private String evolutionStage;

    public EvolvablePokemon(String name, String type, int level,String Characteristic, String evolutionStage) {
        super(name, type, level, Characteristic);
        this.evolutionStage = evolutionStage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("進化段階: " + evolutionStage);
    }
}
