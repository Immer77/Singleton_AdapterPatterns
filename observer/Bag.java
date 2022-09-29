package observer;

public interface Bag extends Subject {

    public void add(String s);

    public void remove(String s);

    public int getCount(String s);
}
