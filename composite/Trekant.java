package composite;

import java.io.PrintWriter;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class Trekant extends Figur {
    private double hoejde;
    private double grundlinje;
    private List<Figur> figurer = new ArrayList<>();

    public Trekant(String navn, double hoejde, double grundlinje) {
        super(navn);
        this.hoejde = hoejde;
        this.grundlinje = grundlinje;
    }


    @Override
    public void addFigur(Figur figur) {
        if(!figurer.contains(figur)){
            figurer.add(figur);
        }
    }

    @Override
    public void removeFigur(Figur figur) {
        if(figurer.contains(figur)){
            figurer.remove(figur);
        }
    }

    @Override
    public void tegn() {
        System.out.println("Tegner en trekant");
    }

    @Override
    public double getAreal() {
        return (this.hoejde * this.grundlinje) / 2;
    }

    @Override
    public Figur getChildren(int index) {
        return figurer.get(index);
    }


}
