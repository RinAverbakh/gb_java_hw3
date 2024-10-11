import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) throws Exception {

        // Реализуйте метод, который принимает на вход целочисленный массив и
        // удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
        // только неотрицательные числа.

        int[] a = new int[]{-1, 2, -3, 4, -5, 6};
        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println(findPositivNumbers(a).toString());
    }

    public static ArrayList<Integer> findPositivNumbers(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int e : array) {
            if (e > 0) result.add(e);
        }
        return result;
    }
}
