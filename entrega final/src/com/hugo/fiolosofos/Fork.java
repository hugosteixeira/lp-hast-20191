package com.hugo.fiolosofos;

class Fork {
    private boolean avaliable = true;
    private int id;

    Fork(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }

    boolean isAvaliable() {
        return this.avaliable;
    }

    void changeDisponibility() {
        this.avaliable = !this.avaliable;
    }
}
