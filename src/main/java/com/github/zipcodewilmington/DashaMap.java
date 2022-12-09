package com.github.zipcodewilmington;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMap implements HashMapX{

    private SinglyLinkedList<KVdata>[] hashArray = new SinglyLinkedList[26];

    public DashaMap(){}

    int charToIndex(char ch){return (ch - 'a');}

    public int keyToIndex(String str){
        char ch = 'a';
        if (str.length() > 0){
            ch = str.charAt(0);
        }
         return this.charToIndex(ch);
    }
    @Override
    public void set(String key, String value) {
        KVdata toKeyValue = new KVdata(key, value);
        int index = this.keyToIndex(key);
        if (hashArray[index] == null) {
            hashArray[index] = new SinglyLinkedList<>();
        }
        hashArray[index].add(toKeyValue);
    }

    @Override
    public String delete(String key) {
        int index = this.keyToIndex(key);
        KVdata target = new KVdata(key, "");
        if (hashArray[index] == null){
            return null;
        }
        int foundIndex = hashArray[index].find(target);
        if (foundIndex == -1){
            return null;
        }
        Node<KVdata> found = hashArray[index].get(foundIndex);
        if (found.hashCode() == hashArray[index].get(0).hashCode()){
            hashArray[index] = null;
        } else {
            hashArray[index].remove(foundIndex);
        }
        return String.valueOf(found.data);
    }

    @Override
    public String get(String key) {
        int index = this.keyToIndex(key);
        KVdata target = new KVdata(key, "");
        if (hashArray[index] == null){
            return null;
        }
        int foundIndex = hashArray[index].find(target);
        if (foundIndex == -1){
            return null;
        }
        Node<KVdata> found = hashArray[index].get(foundIndex);
        return String.valueOf(found.data);
    }

    @Override
    public boolean isEmpty() {
        for (SinglyLinkedList<KVdata> tl : hashArray){
            if (tl != null) {
                if (tl.size() > 0) return false;
            }
        }
        return true;
    }

    @Override
    public long size() {
        int sum = 0;
        for (SinglyLinkedList<KVdata> tl : hashArray){
            if (tl != null){
                sum += tl.size();
            }
        }
        return sum;
    }

    @Override
    public Integer bucketSize(String key) {
        int index = this.keyToIndex(key);
        if (hashArray[index] == null){
            return 0;
        }
        return hashArray[index].size();
    }
}
