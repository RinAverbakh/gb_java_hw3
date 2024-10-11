import java.util.LinkedHashSet;

public class Task2 {
    public static void main(String[] args){
        // Напишите метод, который принимает целочисленный массив и возвращает
        // новый массив, содержащий только уникальные элементы из исходного
        // массива.
        int[] a = {1, 2, 2, 3, 4, 4, 5};
        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println(getUniqueElements(a).toString());
    }

    public static LinkedHashSet<Integer> getUniqueElements(int[] array){
        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        for (int e : array) {
            result.add(e);
        }
        return result;
    }
}
