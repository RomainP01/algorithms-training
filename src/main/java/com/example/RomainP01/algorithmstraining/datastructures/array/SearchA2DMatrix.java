package com.example.RomainP01.algorithmstraining.datastructures.array;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    //optimized
    public boolean searchMatrix2(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        int i = 0;
        int j = column-1;
        while(i<row && j>=0){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]>target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
