package com.example.RomainP01.algorithmstraining.datastructures.array;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    if(!checkRow(board, i, j) || !checkColumn(board, i, j) || !checkSquare(board, i, j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean checkRow(char[][] board, int i, int j){
        for(int k=0; k<9; k++){
            if(k != j && board[i][k] == board[i][j]){
                return false;
            }
        }
        return true;
    }

    public boolean checkColumn(char[][] board, int i, int j){
        for(int k=0; k<9; k++){
            if(k != i && board[k][j] == board[i][j]){
                return false;
            }
        }
        return true;
    }

    public boolean checkSquare(char[][] board, int i, int j){
        int row = i/3;
        int column = j/3;
        for(int k=0; k<3; k++){
            for(int l=0; l<3; l++){
                if((row*3+k != i || column*3+l != j) && board[row*3+k][column*3+l] == board[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
