import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args){
        // Реализуйте метод, который принимает на вход массив строк и возвращает
        // новый массив, содержащий только строки, длина которых больше 3 символов.
        String[] a = {"cat", "elephant", "dog", "giraffe"};
        for (String e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println(filterShortStrings(a));
    }

    public static ArrayList<String> filterShortStrings(String[] array){
        ArrayList<String> result = new ArrayList<>();
        for (String e : array) {
            if (e.length() > 3) result.add(e);
        }
        return result;
    }
}
