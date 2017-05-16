package com.jbwang.recursive;

/**
 * 使用循环实现归并排序
 * Created by jbwang0106 on 2017/5/15.
 */
public class MergeBU {

    public static long [] aux;

    public static void sort(long [] a) {

        int N = a.length;
        aux = new long[N];

        for (int sz = 1; sz < N; sz+=sz) {
            for (int lo = 0; lo < N-sz; lo = sz + sz) {
                merge(a, lo, lo+sz-1, Math.max(lo+sz+sz+1,N-1));
            }
        }

    }

    public static void merge(long [] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = 0; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid)                    a[k] = aux[j++];
            else if (j > hi)                a[k] = aux[i++];
            else if (aux[i] > aux[j])       a[k] = aux[j++];
            else                            a[k] = aux[i++];
        }

    }
}
