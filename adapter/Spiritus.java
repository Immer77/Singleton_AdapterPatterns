package adapter;

public class Spiritus {
    private int prisen;
    private String betgenelse;
    
    public Spiritus(int prisen, String betgenelse) {
        super();
        this.prisen = prisen;
        this.betgenelse = betgenelse;
    }
    
    public int getPrisen() {
        return prisen;
    }
    
    public void setPrisen(int prisen) {
        this.prisen = prisen;
    }
    
    public String getBetgenelse() {
        return betgenelse;
    }
    
    public void setBetgenelse(String betgenelse) {
        this.betgenelse = betgenelse;
    }
    
    public double hentMoms() {
        return prisen * 0.25;
    }
}
