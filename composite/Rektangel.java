package composite;

import java.util.ArrayList;
import java.util.List;

public class Rektangel extends Figur {
    private int laengde;
    private int bredde;
    private List<Figur> figurer = new ArrayList<>();

    public Rektangel(String navn, int laengde, int bredde) {
        super(navn);
        this.laengde = laengde;
        this.bredde = bredde;
    }

    @Override
    public double getAreal() {
        return laengde*bredde;
    }

    @Override
    public void addFigur(Figur figur) {
        if(!figurer.contains(figur)){
            figurer.add(figur);
        }
    }

    @Override
    public void removeFigur(Figur figur) {
        if(figurer.contains(figur)) {
            figurer.remove(figur);
        }
    }

    @Override
    public void tegn() {
        System.out.println("Tegner en Rektangel");
    }

    @Override
    public Figur getChildren(int index){
        return figurer.get(index);
    }
}
