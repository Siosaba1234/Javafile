package pokemon;

public class RegionPokemon extends Pokemon {
    private String region;
// regionPokemonに必要ななまえ、タイプ、出現レベル、特性、生息地を聞く
    public RegionPokemon(String name, String type, int level,String characteristic, String region) {
        super(name, type, level, characteristic);
        this.region = region;
    }
// オーバーライドで継承する
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("生息地: " + region);
    }
}
