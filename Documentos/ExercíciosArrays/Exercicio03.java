
import java.util.Arrays;

public class Exercicio03 {
    public static void main(String[] args) {
        // Exercício resolvido Inicialização com tamanho específico
        // Esta abordagem declara o array com um tamanho específico e depois inicializa cada elemento individualmente
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 15;

        int maior = numeros[0];

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior valor no array é: " + maior);


      

     // Inicialização com Lista de valores e usando a classe 'Arrays'do pacote 'java.utill'. A classe 'Arrays' of do pacote 'java.util'
     int[] numeros2 = {1, 2, 3, 4, 5};
     int maior2 = numeros2[0];

     for (int numero2 : numeros2) {
        if (numero2 > maior2) {
            maior2 = numero2;
        }
     }
     // Imprimindo o maior valor do array usando o método System.out.println
     System.out.println("O maior valor no array é: " + maior2);
     

    
    

    // Outra forma inicilizar o array com uma lista de valores mas usando a palavra-chave 'new'.
    int[] numeros3 = new int[] {1, 2, 3, 4, 5};
    int maior3 = numeros3[0];

    for (int numero3 : numeros3) {
       if (numero3 > maior3) {
          maior3 = numero3;
       }
    }

    // Usando Arrays.toString() para imprimir o array
    // Importação Desnecessária: 'import java.util.Arrays;' é desnecessário aqui
    System.out.println("Array: " + Arrays.toString(numeros3));



    }
}
