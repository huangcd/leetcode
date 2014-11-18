package com.leetcode.huangcd;

/**
 * Date: 12/16/13
 * <p/>
 * Time: 9:37 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if (word.length() == 0) {
            return true;
        }
        if (board.length == 0 || board[0].length == 0) {
            return false;
        }
        int height = board.length;
        int width = board[0].length;
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                if (board[h][w] == word.charAt(0)) {
                    if (search(board, word, h, w, new boolean[height][width], 1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, String word, int h, int w, boolean[][] visited, int index) {
        if (index == word.length()) {
            return true;
        }
        int height = board.length;
        int width = board[0].length;
        visited[h][w] = true;
        char c = word.charAt(index);
        if (h > 0 && !visited[h - 1][w] && board[h - 1][w] == c && search(board, word, h - 1, w, visited, index + 1)) {
            return true;
        }
        if (h < height - 1 && !visited[h + 1][w] && board[h + 1][w] == c && search(board, word, h + 1, w, visited, index + 1)) {
            return true;
        }
        if (w > 0 && !visited[h][w - 1] && board[h][w - 1] == c && search(board, word, h, w - 1, visited, index + 1)) {
            return true;
        }
        if (w < width - 1 && !visited[h][w + 1] && board[h][w + 1] == c && search(board, word, h, w + 1, visited, index + 1)) {
            return true;
        }
        visited[h][w] = false;
        return false;
    }
}
