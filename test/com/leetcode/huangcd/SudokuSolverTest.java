package com.leetcode.huangcd;

import org.junit.Test;

import java.util.Arrays;

/**
 * Date: 12/15/13
 * <p/>
 * Time: 4:38 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class SudokuSolverTest {

    @Test
    public void testSolveSudoku() throws Exception {
        SudokuSolver test = new SudokuSolver();
        String[] boardString;
        char[][] board;
        boardString = new String[]{"123456789", "456789123", "789123456", "234567891", "567891234", "89.234567", "345678912", "678912345", "91234567."};
        board = new char[9][];
        for (int i = 0; i < boardString.length; i++) {
            board[i] = boardString[i].toCharArray();
        }
        test.solveSudoku(board);
        for (char[] aBoard : board) {
            System.out.println(Arrays.toString(aBoard));
        }
        boardString = new String[]{"..9748...", "7........", ".2.1.9...", "..7...24.", ".64.1.59.", ".98...3..", "...8.3.2.", "........6", "...2759.."};
        board = new char[9][];
        for (int i = 0; i < boardString.length; i++) {
            board[i] = boardString[i].toCharArray();
        }
        test.solveSudoku(board);
        for (char[] aBoard : board) {
            System.out.println(Arrays.toString(aBoard));
        }

        boardString = new String[] {".87654321","2........","3........","4........","5........","6........","7........","8........","9........"};
        board = new char[9][];
        for (int i = 0; i < boardString.length; i++) {
            board[i] = boardString[i].toCharArray();
        }
        test.solveSudoku(board);
        for (char[] aBoard : board) {
            System.out.println(Arrays.toString(aBoard));
        }
    }
}
