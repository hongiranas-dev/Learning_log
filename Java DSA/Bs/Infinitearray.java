public class Infinitearray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;

        int start = 0;
        int end = 1;

        // Expand window safely
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;

            if (end >= arr.length) {
                end = arr.length - 1;
            }

            start = newStart;
        }

        System.out.println("Range Found:");
        System.out.println("Start = " + start);
        System.out.println("End = " + end);
    }
}
