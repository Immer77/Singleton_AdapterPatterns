package composite;

public abstract class Figur {
    String navn;

    public Figur(String navn) {
        this.navn = navn;
    }



    public abstract void addFigur(Figur figur);

    public abstract void removeFigur(Figur figur);

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public abstract void tegn();

    public abstract double getAreal();

    public abstract Figur getChildren(int index);
}
