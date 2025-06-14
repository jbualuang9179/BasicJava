package fundamentals.array;

public class Array1Dimension {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int total  = 0;
        // for (int i = 0; i < array.length; i++) { total = total + array[i]; }
        for (int j : array) {
            total += j;
        }
        System.out.println("total = " + total);
    }

}
