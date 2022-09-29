package singleton;

public class Person {
    private String navn;
    private int alder;
    private String cpr;

    public Person(String navn, int alder, String cpr) {
        this.navn = navn;
        this.alder = alder;
        this.cpr = cpr;
    }

    public String getNavn() {
        return navn;
    }

    public int getAlder() {
        return alder;
    }

    public String getCpr() {
        return cpr;
    }

    @Override
    public String toString(){
        return "navn: " + navn + " alder" + alder + " cpr" + cpr;
    }
}
