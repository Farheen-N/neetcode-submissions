
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer>[] rows = new HashSet[9];
        Set<Integer>[] cols = new HashSet[9];
        Set<Integer>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int box = (i / 3) * 3 + j / 3;
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';

                    if (rows[i].contains(num) || cols[j].contains(num) || boxes[box].contains(num)) {
                        return false;
                    } else {
                        rows[i].add(num);
                        cols[j].add(num);
                        boxes[box].add(num);
                    }
                }
            }
        }
        return true;
    }
}