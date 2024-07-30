
import java.util.Arrays;

public class Exercicio05 {
    public static void main(String[] args) {

     // Inicialização com Lista de valores e usando a biblioteca usando na linha 'Arrayss.sort'(numeros); 'é a classe 'Arrays' do pacote 'java.util'. 
        int[] numeros = {5, 2, 8, 4, 1, 7};

        Arrays.sort(numeros);

        for (int numero : numeros) {
            System.out.println(numero + "");
            
        }



    
     // Exercício resolvido com Inicialização com tamanho específico
     // Esta abordagem declara o array com um tamanho específico e depois inicializa cada elemento individualmente
      int[] numeros2 = new int[6];
      numeros2[0] = 5;
      numeros2[1] = 2;
      numeros2[2] = 8;
      numeros2[3] = 4;
      numeros2[4] = 1;
      numeros2[5] = 7;

      Arrays.sort(numeros2);

      for (int numero1 : numeros2) {
          System.out.println(numero1 + "");
      }



    }
}