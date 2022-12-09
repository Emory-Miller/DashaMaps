package com.github.zipcodewilmington;

public class KVdata implements Comparable<KVdata>{
    public String k;
    public String v;

    public KVdata() {
        k = "";
        v = "";
    }

    public KVdata(String k, String v) {
        this.k = k;
        this.v = v;
    }

    public String key(){return this.k;}

    @Override
    public int compareTo(KVdata o) {
        return 0;
    }
}
