import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int size = Integer.parseInt(scanner.nextLine());

        for (int row=1; row<=size; row++){
            printer(size, row);
        }
        for (int i=size-1; i>=0; i--){
            printer(size, i);
        }

    }

    private static void printer(int size, int row) {
        printLeadingSpaces(row, size);
        printStars(row);
        System.out.println();
    }

    private static void printStars(int row) {
        for (int i=0; i<row; i++){
            System.out.print("* ");
        }
    }

    private static void printLeadingSpaces(int row, int size) {
        int spaceCount = Math.abs(size  - row);
        for (int i=0; i<spaceCount; i++){
            System.out.print(" ");
        }
    }
}