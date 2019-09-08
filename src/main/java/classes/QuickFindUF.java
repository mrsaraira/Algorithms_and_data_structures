package classes;

import java.util.Arrays;

public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int n) {
        id = new int[n];

        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public QuickFindUF() {

    }

    public void union(int p, int q) {
        int pid = p;
        int qid = q;
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) id[i] = qid;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    @Override
    public String toString() {
        return "QuickFindUF{" +
                "id=" + Arrays.toString(id) +
                '}';
    }

    public static void main(String[] args) {
        // 1
        QuickFindUF quickFind = new QuickFindUF(10);
        quickFind.union(5, 6);
        System.out.println(quickFind.connected(5, 6));
        System.out.println(quickFind);

        //2
        QuickUnionUF quickUnion = new QuickUnionUF(10);
        System.out.println(quickUnion);
        System.out.println(quickUnion.connected(2, 4));
        quickUnion.union(2, 4);
        quickUnion.union(3, 5);
        quickUnion.union(3, 2);
        System.out.println(quickUnion.connected(2, 4));
        System.out.println(quickUnion);

        //2 improved by weighting
        QuickUnionUFWeighted quickUnionWeighted = new QuickUnionUFWeighted(10);
        System.out.println(quickUnionWeighted);
        quickUnionWeighted.union(4, 3);
        quickUnionWeighted.union(3, 8);
        quickUnionWeighted.union(6, 5);
        quickUnionWeighted.union(9, 4);
        quickUnionWeighted.union(2, 1);
        quickUnionWeighted.union(5, 0);
        quickUnionWeighted.union(7, 2);
        quickUnionWeighted.union(6, 1);
        quickUnionWeighted.union(7, 3);
        System.out.println(quickUnionWeighted);

    }
}
