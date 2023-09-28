package io.tiledb.cloud;

public class Pair<F, S> implements java.io.Serializable {
    private F first;
    private S second;

    private Pair() {}

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    /**
     * Returns an empty Pair
     *
     * @return The Pair
     */
    public static Pair empty() {
        return new Pair();
    }
}

