package BinarySearch;

public class Main {

    public static void main(String[] args) {
        int[] values = {1, 1, 2, 3, 4, 10};
        int valueToFind = 3;

        System.out.printf("Index = %d%n", binarySearch(values, valueToFind, 0, values.length - 1));
    }

    private static int binarySearch(int[] values, int valueToFind, int l, int r) {
        if (l == r) {
            return (values[l] == valueToFind) ? l : -1;
        }

        int m = (l + r) / 2;

        if (valueToFind > values[m]) {
            return binarySearch(values, valueToFind, m + 1, r);
        } else if (values[m] > valueToFind) {
            return binarySearch(values, valueToFind, l, m - 1);
        }
        return m;
    }

}