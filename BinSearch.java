public class BinSearch {


    public static int binSearch(int[] numbers, int key) {
        int low = 0;
        int high = numbers.length - 1;
        int middle = 0;
        int index = -1;

        while (low <= high) {
            middle = (high + low) / 2;

            if (numbers[middle] < key) {
                low = middle + 1;
            } else if (numbers[middle] > key) {
                high = middle - 1;
            } else if (numbers[middle] == key) {
                index = middle;
                break;
            }
        }

        return index;

        
    }

    public static void main(String [] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("4: " + binSearch(numbers, 4));
        System.out.println("1: " + binSearch(numbers, 1));
        System.out.println("8: " + binSearch(numbers, 8));
        System.out.println("9: " + binSearch(numbers, 9));   
    }

}