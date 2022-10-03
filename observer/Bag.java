package observer;

public interface Bag extends Subject {

    void add(String s);

    void remove(String s);

    int getCount(String s);
}
