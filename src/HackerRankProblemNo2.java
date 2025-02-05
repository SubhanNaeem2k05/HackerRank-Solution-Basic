import java.util.Arrays;

public class HackerRankProblemNo2 {

    public static int minExecutionTime(int[] files, int numCores, int limit) {

        Arrays.sort(files);
        reverseArray(files);

        int totalTime = 0;
        int parallelizedFiles = 0;

        for (int file : files) {
            if (file % numCores == 0 && parallelizedFiles < limit) {
                totalTime += file / numCores;
                parallelizedFiles++;
            } else {
                // Execute the file sequentially
                totalTime += file;
            }
        }
        return totalTime;
    }

    private static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }



    public static void main(String[] args) {

        int[] files = {4, 1, 3, 2, 8};
        int numCores = 4;
        int limit = 1;

        System.out.println(minExecutionTime(files, numCores, limit));

    }
}
