package hashtable.buildOwnHashTable;

public class Main {

    public static void main(String[] args) {
         HashTable myHashtable = new HashTable(10);
         myHashtable.set(10,"amy");
         myHashtable.set("zack",10);
         myHashtable.set(1,true);

         System.out.println(myHashtable.get(10));
         System.out.println(myHashtable.get("zack"));
         System.out.println(myHashtable.get(1));
    }

}

//hashTable class
class HashTable {
    private Object[] buckets;

    public HashTable(int size) {
        this.buckets = new Object[size];
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
        this.buckets[index] = value;
    }

    public Object get(Object key) {
        String myValue = key.toString();
        int index = hash(myValue);
        return this.buckets[index];
    }

}
