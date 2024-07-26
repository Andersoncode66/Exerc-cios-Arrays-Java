
import java.util.Arrays;

public class Exercicio01 {
    public static void main(String[] args) {
        
        // Exercício resolvido Inicialização com Tamanho Específico
        // Esta abordagem declara o array com um tamanho específico e depois inicializa cada elemento individualmente
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        System.out.println("Número "+ numeros [0]);
        System.out.println("Número " + numeros [1]);
        System.out.println("Número " + numeros [2]);
        System.out.println("Número " + numeros [3]);
        System.out.println("Número "+ numeros [4]);

       
        // Inicialização com Lista de valores e usando a classe 'Arrays'do pacote 'java.utill'. A classe 'Arrays' of do pacote 'java.util'
        int[] numeros2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numeros2));

         
        // Outra forma inicializar o array com uma lista de valores, mas usando a palavra-chave 'new'.
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};
        for (int numero : numeros3) {
            System.out.println("Numeros: " + numero);
        }



    }
}