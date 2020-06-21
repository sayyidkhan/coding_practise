package hashtable;

import java.util.ArrayList;
import java.util.stream.Stream;

public class AndreiMain {

    public static void main(String[] args) {
        AndreiHashTable myHashtable = new AndreiHashTable(10);
        myHashtable.set(10,"amy");
        myHashtable.set("zack",10);
        myHashtable.set("zac1",72);
        myHashtable.set(1,true);

        System.out.println(myHashtable.get(10));
        System.out.println(myHashtable.get("zack"));
        System.out.println(myHashtable.get("zac1"));
        System.out.println(myHashtable.get(1));

        myHashtable.printAllKeys();
    }

}

//hashTable class
class AndreiHashTable {
    private AndreiHashNode[] buckets;

    public AndreiHashTable(int size) {
        this.buckets = new AndreiHashNode[size];
    }

    private int hash(String key){
        int hash = 0;
        for(int i = 0;i < key.length();i++){
            hash = (hash + key.charAt(i) * i) % this.buckets.length;
        }
        return hash;
    }

    public void set(Object key,Object value){
        String myValue = key.toString();
        int index = hash(myValue);
        this.buckets[index] = new AndreiHashNode(key,value);
    }

    public Object get(Object key) {
        String myValue = key.toString();
        int index = hash(myValue);
        AndreiHashNode andreiHashNode = this.buckets[index];
        return andreiHashNode.getValue();
    }

    public void printAllKeys(){
        System.out.println("Print all keys in a hashTable");
        Stream.of(buckets).forEach(andreiHashNode -> {
            if(andreiHashNode != null) System.out.println(andreiHashNode.getKey());
        });
    }

    class AndreiHashNode {
        private Object key;
        private Object value;

        public AndreiHashNode(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public Object getKey() {
            return key;
        }

        public void setKey(Object key) {
            this.key = key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }

}
