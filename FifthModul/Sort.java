package FifthModul;

public class Sort {
    public static int [] sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int imin = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    imin = j;
                }
            }

            if (i != imin) {
                int temp = arr[i];
                arr[i] = arr[imin];
                arr[imin] = temp;
            }
        }
        return arr;
    }
  }
