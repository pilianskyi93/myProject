package MyHomeworks.Homework7.Task1;

public class ExceptionHandling {
    public static void divideArrayElements(int[] array) {
        try {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("The array is empty or null");
            }


            int[] resultArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= 0) {
                    throw new IllegalArgumentException("Invalid array element: " + array[i]);
                }
                resultArray[i] = array[i] / 5;
            }
            System.out.print("New array: ");
            for (int i = 0; i < resultArray.length; i++) {
                System.out.print(resultArray[i] + " ");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 15, 20, 25, -10};
        divideArrayElements(array);
    }
}