
import java.io.IOException;

public class AsteriskFor {
    public static void main(String[] args) throws IOException {
        record Position(int x, int y) {}
        int[][] map = {
                {0, 0, 1, 0, 1, 0},
                {1, 0, 1, 0, 0, 1},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 1, 1},
                {1, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 1, 0},
                {1, 0, 1, 0, 0, 1},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 1, 1}
        };

        // 迷路の表示
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (map[y][x] == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
