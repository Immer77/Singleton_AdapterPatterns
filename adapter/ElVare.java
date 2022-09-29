package adapter;

public class ElVare extends Vare{

    public ElVare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnmoms() {
        double result = getPris() * 1.3;

        return getPris() * 1.3;
    }
}
