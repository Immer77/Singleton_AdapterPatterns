package composite;

import java.util.ArrayList;
import java.util.List;

public class Ellipse extends Figur{
    private double radius1;
    private double radius2;
    private List<Figur> figurer = new ArrayList<>();

    public Ellipse(String navn, double radius1, double radius2) {
        super(navn);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public double getAreal() {
        return Math.PI * radius1 * radius2;
    }

    @Override
    public Figur getChildren(int index) {
        return figurer.get(index);
    }

    public void addFigur(Figur figur) {

        figurer.add(figur);

    }

    @Override
    public void removeFigur(Figur figur) {
        if(figurer.contains(figur)) {
            figurer.remove(figur);
        }
    }

    @Override
    public void tegn() {
        System.out.println("Tegner en Ellipse");
    }
}
