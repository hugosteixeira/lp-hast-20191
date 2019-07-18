package com.hugo.matriz;


public class Main {

    public static void main(String[] args) {
	    float[][] matriz1 = {{5,4}, {1,5}, {5,7}};
	    float[][] matriz2 = {{1,6,3}, {3,1,2}};

	    if (matriz1[0].length != matriz2.length) {
            System.out.println("Não é possível multiplicar essas matrizes");
            return;
        }


        float[][] matrizResultante = new float[matriz1.length][matriz2[0].length];
        ThreadsList<Multiplicador> threadsList = new ThreadsList<>();

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                Multiplicador multiplicador = new Multiplicador(matrizResultante, matriz1, matriz2, i, j);
                threadsList.add(multiplicador);
            }
        }

        threadsList.start();

        for (float[] row : matrizResultante) {
            for (float value : row) System.out.print(value + " ");
            System.out.println();
        }
    }
}
