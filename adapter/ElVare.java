package adapter;

public class ElVare extends Vare{

    public ElVare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnmoms() {
        double result = getPris() * 0.3;
        if(result < 3){
            return 3;
        }else{
            return result;
        }

    }
}
