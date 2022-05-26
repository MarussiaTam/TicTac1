import java.util.Scanner;

public class Tic1 {

    public static Scanner scanner = new Scanner(System.in);
    public static final int SIZE = 3;
    public static char[][] map;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_HUMAN= 'X';
    public static final char DOT_PC = '0';

    public static void main(String[] args) {
        initMap();
        printMap();
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}






