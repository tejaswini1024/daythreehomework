package cake;

public class WeddingCake extends Cake{

    private int tiers;

    public WeddingCake(){
        super("Rum");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
