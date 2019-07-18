package com.hugo.matriz;

public class Multiplicador extends Thread {
    private int x, y;
    private float[][] matrizResultante, matriz1, matriz2;

    Multiplicador(float[][] matrizResultante, float[][] matriz1, float[][] matriz2, int x, int y) {
        this.x = x;
        this.y = y;
        this.matrizResultante = matrizResultante;
        this.matriz1 = matriz1;
        this.matriz2 = matriz2;
        System.out.println(x);
    }

    private float sumArray(float[] arr) {
        float sum = 0;
        for (float value : arr) {
            sum += value;
        }
        return sum;
    }

    private float[] getColumn(float[][] matriz, int index) {
        float[] result = new float[matriz.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = matriz[i][index];
        }
        return result;
    }

    @Override
    public synchronized void run() {
        float[] col1 = matriz1[x];
        float[] col2 = getColumn(matriz2, y);
        float[] result = new float[col1.length];
        for (int i = 0; i < col1.length; i++) {
            result[i] = col1[i] * col2[i];
        }
        matrizResultante[x][y] = sumArray(result);
    }
}
