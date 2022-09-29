package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ObservableBag implements Bag, Iterable<String> {

    // Laver en arrayliste af observers der skal lytte på observable Bag
    private ArrayList<Observer> observers = new ArrayList<>();
    // Laver hashmap hvor der skal tilføjes String værdier
    HashMap<String, Integer> hashmap;

//Constructor som skaber et nyt hashmap
    public ObservableBag(){
        createNewHashMap();
    }

    // Metoder
    /*
    Metode der skaber et nyt hashmap
     */
    private HashMap<String, Integer> createNewHashMap(){
        hashmap = new HashMap<>();
        return hashmap;
    }

    // Implemnteres fra Subject interface
    // Tjekker om hashmap allerede har nøglen s og notifies observer når det er blevet gjort
    @Override
    public void add(String s) {
        if(hashmap.containsKey(s)){
            hashmap.put(s,hashmap.get(s)+1);
        }else{
            hashmap.put(s,1);
        }
        notifyObservers(s,getCount(s));
    }

    // Gør det modsatte af ovenstående
    @Override
    public void remove(String s) {
        if(hashmap.containsKey(s)){
            hashmap.remove(s);
        }
        notifyObservers(s,getCount(s));

    }

    @Override
    public int getCount(String s) {
        return hashmap.get(s);
    }

    // Add & remove metoder
    @Override
    public void registerObserver(Observer o) {
        if(!observers.contains(o)){
            observers.add(o);
        }

    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)){
            observers.remove(o);
        }

    }

    // Notificere Observers
    public void notifyObservers(String s, int antal){
        for(Observer o : observers){
            o.update(s,antal);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return hashmap.keySet().iterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return Iterable.super.spliterator();
    }
}
