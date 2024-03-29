package com.smiles.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
