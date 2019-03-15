package Table;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {


    ArrayList<Entry> entries = new ArrayList<Entry>();

    K key;
    V value;

    public Table(ArrayList entries) {

        this.entries = entries;


    }

    public Table() {


    }


    public V get(K key) {
        V value = null;

        for (int i = 0; i < entries.size(); i++) {


            if (entries.get(i).getKey().equals(key)) {
                value = (V) entries.get(i).getValue();

            }

            else
                return null;
        }
        return value;
    }


    public void put (K key,V value){

        Entry entry = new Entry(key, value);

        if (entries.contains(entry)) {

            entries.remove(key);

            entries.add(entry);
        }

        else {


        }
        entries.add(entry);


    }


    public void remove (K key) {

        V value = null;

        for (int i = 0; i < entries.size(); i++) {


            if (entries.get(i).getKey().equals(key)) {
                entries.remove(i);

            }

        }
    }


}
















