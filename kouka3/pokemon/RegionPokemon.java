package pokemon;

// ファイル: RegionalPokemon.java


public class RegionPokemon extends Pokemon {
    private String region;

    public RegionPokemon(String name, String type, int level,String Characteristic, String region) {
        super(name, type, level, Characteristic);
        this.region = region;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("生息地: " + region);
    }
}
