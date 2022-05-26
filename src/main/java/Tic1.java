public class Tic1 {

    public static final int SIZE = 3;


    public static void main(String[] args) {
        initMap();
        printMap();
    }

    public static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void printMap() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }

    }
}






