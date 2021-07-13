package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        int[] array = extractDiagonal(board);
        for (int i = 0; i < board.length; i++) {
            if (array[i] == 1
                    && (monoHorizontal(board, i) || monoVertical(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
    public static boolean monoHorizontal(int[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static int[] extractDiagonal(int[][] board) {
        int[] rsl = new int[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];

        }
        return rsl;
    }
}
