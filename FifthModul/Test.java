package FifthModul;

public class Test {
    public static void main(String[] args){
        int [] a = {3, 5, -2, 20, 100, -25, 777};
        System.out.println("минимальное значение: " + MinMax.getMin(a));
        System.out.println("максимальное значение: " + MinMax.getMax(a));

    Sort.sortArr(a);
        for (int element: a){
            System.out.print(element + " ");
        }
    }

}
