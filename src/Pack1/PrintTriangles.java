package Pack1;

public class PrintTriangles {
    public static void main(String[] args) {
        System.out.println("Triangle 1:");
        Triangle1();

        System.out.println("\nTriangle 2:");
        Triangle2();

        System.out.println("\nTriangle 3:");
        Triangle3();
    }

    public static void Triangle1() {
        for (int row = 1; row <= 6; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Triangle2() {
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Triangle3() {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}