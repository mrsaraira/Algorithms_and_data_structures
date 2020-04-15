package com.mrsarayra.algorithms.classes;

public class QuickUnionPathCompressed extends QuickUnionUFWeighted {
    @Override
    protected int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
}
