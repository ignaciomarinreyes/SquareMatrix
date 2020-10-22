package model;

import java.util.concurrent.ThreadLocalRandom;

public class Matrix {

    private final int height = 10;
    private final int width = 10;
    private int maxValue;
    private int minValue;

    private final int[][] matrix;

    public Matrix(int maxValue, int minValue) {
        this.maxValue = maxValue;
        this.minValue = minValue;
        this.matrix = new int[height][width];
        fillMatrix();
    }

    private void fillMatrix() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(minValue, maxValue + 1);
            }
        }
    }

    public void updateMatrix(int maxValue, int minValue) {
        this.maxValue = maxValue;
        this.minValue = minValue;
        fillMatrix();
    }

    public String getValues(int value) {
        String result = "\n\n";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (matrix[i][j] <= value) {
                    result += "-";
                } else {
                    result += "" + matrix[i][j];
                }
                if (j < width - 1) {
                    result += "\t";
                }
            }
            result += "\n";
        }
        return result;
    }
}