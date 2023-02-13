package com.example.RomainP01.algorithmstraining.datastructures.array;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result = new int[r][c];
        int row = mat.length;
        int col = mat[0].length;
        if (row * col != r * c) {
            return mat;
        }
        int[] temp = new int[row * col];
        int k = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[k++] = mat[i][j];
            }
        }
        k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = temp[k++];
            }
        }
        return result;
    }

    //optimized solution
    public int[][] matrixReshape2(int[][] mat, int r, int c) {
        int[][] result = new int[r][c];
        int row = mat.length;
        int col = mat[0].length;
        if (row * col != r * c) {
            return mat;
        }
        for (int i = 0; i < row * col; i++) {
            result[i / c][i % c] = mat[i / col][i % col];
        }
        return result;
    }
}
