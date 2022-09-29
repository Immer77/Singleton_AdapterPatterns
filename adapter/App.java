package adapter;

public class App {
    public static void main(String[] args) {
        ElVare elVare = new ElVare(100,"Tandbørste");
        FoedeVare foedeVare = new FoedeVare(10,"Mølk");
        Spiritus spiritus = new Spiritus(200,"Vodka");
        SpiritusTilVareAdapter sp = new SpiritusTilVareAdapter(spiritus);

        System.out.println(sp.beregnmoms());
        System.out.println(elVare.beregnmoms());
        System.out.println(foedeVare.beregnmoms());
    }
}
