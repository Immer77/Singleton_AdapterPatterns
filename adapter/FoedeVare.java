package adapter;

public class FoedeVare extends Vare{
    public FoedeVare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnmoms() {
        return getPris() * 1.05;
    }
}
