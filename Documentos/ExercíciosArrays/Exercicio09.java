import java.util.HashSet;

public class Exercicio09 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 4, 5};
        HashSet<Integer> set = new HashSet<>();

        for (int numero : numeros) {
            set.add(numero);
            
        }

        for (int numero : set) {
            System.out.println(numero + "");
            
        }

    }
}
