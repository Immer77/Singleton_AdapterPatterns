package composite;

import java.util.ArrayList;

public class SammensatteFigurer extends Figur{
    private ArrayList<Figur> figurer = new ArrayList<>();

    public SammensatteFigurer(String navn) {
        super(navn);
    }

    @Override
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
        for (Figur f : figurer){
            f.tegn();
        }
    }

    @Override
    public double getAreal() {
        double result = 0;
        for (Figur f : figurer){
            result += f.getAreal();
        }
        return result;
    }

    @Override
    public Figur getChildren(int index) {
        return figurer.get(index);
    }
}
