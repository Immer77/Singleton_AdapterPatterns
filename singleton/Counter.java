package singleton;

public class Counter {
    private static Counter uniqueinstance;
    private int antal;

    private Counter(){

    }

    public static Counter getInstance(){
        if(uniqueinstance == null){
            uniqueinstance = new Counter();
        }
        return uniqueinstance;
    }

    public void count(){
        antal++;
    }

    public void times2(){
        antal*=2;
    }

    public void zero(){
        antal = 0;
    }

    public static Counter getUniqueinstance() {
        return uniqueinstance;
    }

    public int getAntal() {
        return antal;
    }
}
