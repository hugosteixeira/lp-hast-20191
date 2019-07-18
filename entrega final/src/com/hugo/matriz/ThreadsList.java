package com.hugo.matriz;

import java.util.ArrayList;
import java.util.List;

public class ThreadsList<T extends Thread> {
    private List<T> threads = new ArrayList<>();

    public void add(T t) {
        threads.add(t);
    }

    public void start() {
        for (T t : threads) {
            t.start();
        }
    }

    public void join() {
        for (T t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
