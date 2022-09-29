package adapter;

public class SpiritusTilVareAdapter implements VareI{
    private Spiritus spiritus;

    public SpiritusTilVareAdapter(Spiritus spiritus) {
        this.spiritus = spiritus;
    }

    @Override
    public int getPris() {
        return spiritus.getPrisen();
    }

    @Override
    public void setPris(int pris) {
        spiritus.setPrisen(pris);
    }

    @Override
    public String getNavn() {
        return spiritus.getBetgenelse();
    }

    @Override
    public void setNavn(String navn) {
        spiritus.setBetgenelse(navn);
    }

    @Override
    public double beregnmoms() {
        return spiritus.hentMoms();
    }
}
