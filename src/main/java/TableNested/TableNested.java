package TableNested;

import Table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {


    ArrayList<Table.Entry> entries = new ArrayList<Table.Entry>();

    K key;
    V value;

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

        Table.Entry entry = new Table.Entry(key, value);

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








    public class Entry<K, V> {

        private K key;
        private V value;

        public Entry(K key, V value) {

            this.key = key;
            this.value = value;
        }

        public K getKey() {

            return key;
        }

        public V getValue() {

            return value;
        }


    }

}
