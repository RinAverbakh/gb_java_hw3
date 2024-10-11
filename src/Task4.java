import java.lang.Math;

public class Task4 {
    public static void main(String[] args){
        // Напишите метод, который принимает массив целых чисел и возвращает
        // среднее значение элементов массива, округленное до ближайшего целого
        // числа.
        int[] a = {4, 2, 7, 5, 1};
        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println(calculateAverage(a));
    }

    public static long calculateAverage(int[] array) {
        double result = 0;
        for (int e : array) {
            result += e;
        }
        result = result / array.length;
        return Math.round(result);
    }
}
