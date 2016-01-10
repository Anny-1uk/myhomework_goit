package FifthModul;

public class MinMax {
    public static int getMin(int[] a){
        int min = a[0];
        for (int i=0; i < a.length - 1; i++ ){
            if (min > a[i+1]) {
                min = a[i+1];
            }
        }
        return min;
    }

    public static int getMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (max < a[i + 1]) {
                max = a[i + 1];
            }
        }
        return max;
    }
}
