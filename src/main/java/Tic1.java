import java.util.Random;
import java.util.Scanner;

public class Tic1 {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static final int SIZE = 3;
    public static char[][] map;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_HUMAN= 'X';
    public static final char DOT_PC = '0';

    public static void main(String[] args) {
        initMap();
        printMap();
        playGame();
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

    public static void playGame() {
    while (true) {
        humanTurn();
        printMap();
        if (checkEnd(DOT_HUMAN)) {
            break;
        }

        pcTurn();
        printMap();
        if (checkEnd(DOT_PC)) {
            break;
        }
    }
 }

        public static void humanTurn() {
        System.out.println("Human's move!");

        int rowNumber;
        int columnNumber;

        while (true) {
            System.out.print("Enter the line number: ");
            rowNumber = scanner.nextInt() - 1;
            System.out.print("Enter the column number: ");
            columnNumber = scanner.nextInt() - 1;

            if (isCellFree(rowNumber,columnNumber)) {
                break;
            }
            System.out.printf("The case %d %d is busy%n%n", rowNumber +1, columnNumber + 1);
        }
        map[rowNumber][columnNumber] = DOT_HUMAN;
    }
    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return map[rowNumber][columnNumber] == DOT_EMPTY;

    }
    private static boolean checkEnd(char symbol) {
        return false;
    }
    private static void pcTurn() {
        System.out.println("PC's move!");
        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
        } while (!isCellFree(rowNumber,columnNumber));
            map[rowNumber][columnNumber] = DOT_PC;
    }
}






