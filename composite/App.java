package composite;

public class App {
    public static void main(String[] args) {
        Trekant trekant = new Trekant("Trekant", 15,20);
        Rektangel rektangel = new Rektangel("Rektangel" , 10, 5);
        Ellipse ellipse = new Ellipse("Ellipse",10,20);
        SammensatteFigurer sammensatteFigurer = new SammensatteFigurer("SammensatFigur");


        sammensatteFigurer.addFigur(trekant);
        sammensatteFigurer.addFigur(trekant);
        sammensatteFigurer.addFigur(rektangel);
        sammensatteFigurer.addFigur(ellipse);


        System.out.println(sammensatteFigurer.getAreal());
        sammensatteFigurer.tegn();

    }
}
