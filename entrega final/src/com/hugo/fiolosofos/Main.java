package com.hugo.fiolosofos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final int n = 5;
        List<Fork> listaForks = new ArrayList<>();
        ThreadsList<Philosopher> threadsList = new ThreadsList<>();

        for (int i = 0; i < n; i++) {
            Fork fork = new Fork(i);
            listaForks.add(fork);
        }

        for (int i = 0; i < n; i++) {
            Philosopher philosopher = new Philosopher(listaForks, i, n);
            threadsList.add(philosopher);
        }

        threadsList.start();
    }
}
