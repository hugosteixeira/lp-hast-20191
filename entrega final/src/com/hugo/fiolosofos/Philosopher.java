package com.hugo.fiolosofos;

import java.util.Random;
import java.util.List;

public class Philosopher extends Thread{
    private Random random = new Random();
    private List<Fork> forks;
    private boolean ate = false;
    private int id, lastId;

    Philosopher(List<Fork> forks, int id, int N) {
        this.forks = forks;
        this.id = id;
        if (id == 0){
            this.lastId = N-1;
        }else{
            this.lastId = id-1;
        }

    }


    private void think() {
        try {
            int time = random.nextInt(11);
            sleep(time);
            System.out.println("philosopher " + id + " thinked for: " + time + "ms");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("Philo " + id + " sat on table.");
        while (!ate) {
            Fork fork1 = forks.get(id%2 == 0 ? lastId : id);
            while (!fork1.isAvaliable()) {
                think();
            }
            fork1.changeDisponibility();
            System.out.println("Philo " + id + " took the fork " + fork1.getId());
            Fork fork2 = forks.get(id%2 == 0 ? id : lastId);
            if (!fork2.isAvaliable()) {
                System.out.println("Philo " + id + " droped the fork " + fork1.getId());
                fork1.changeDisponibility();
                think();
            } else {
                fork2.changeDisponibility();
                System.out.println("Philo " + id + "took the fork " + fork2.getId());
                this.ate = true;
                fork1.changeDisponibility();
                fork2.changeDisponibility();
                System.out.println("Philo " + id + "is full and have no more forks.");
            }
        }
    }
}
