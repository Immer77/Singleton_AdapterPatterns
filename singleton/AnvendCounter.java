package singleton;

public class AnvendCounter {
    public static void main(String[] args) {
        Counter c = Counter.getInstance();

        c.count();
        System.out.println(c.getAntal());
        c.times2();
        System.out.println(c.getAntal());
        c.zero();
        System.out.println(c.getAntal());

    }
}
