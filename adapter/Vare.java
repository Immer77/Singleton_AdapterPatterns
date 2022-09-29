package adapter;

public abstract class Vare implements VareI {
    private int pris;
    private String navn;

    public Vare(int pris, String navn) {
        this.pris = pris;
        this.navn = navn;
    }

    @Override
    public int getPris() {
        return pris;
    }

    @Override
    public void setPris(int pris) {
        this.pris = pris;
    }

    @Override
    public String getNavn() {
        return navn;
    }

    @Override
    public void setNavn(String navn) {
        this.navn = navn;
    }

}
