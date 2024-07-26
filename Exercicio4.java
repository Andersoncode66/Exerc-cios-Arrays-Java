public class Exercicio4 {
    public static void main(String[] args) {

        // Inicializa um array com os valores {1, 2, 3, 4, 5}
        int[] numeros = {1, 2, 3, 4, 5};
        // Cria um novo array com o mesmo tamanho do array 'numeros', para armazenar o valores em ordem invertida
        int[] invertido = new int[numeros.length];
        

        // Inverte os elementos do array 'numeros' e armazena no array 'invertido' 
        for (int i = 0; i < numeros.length; i++) {
            // Atribui o valor do array 'numeros' em ordem inversa para o array 'invertido'
            invertido[i] = numeros[numeros.length - 1 - i];
        }
        
        // Imprime os elementos do array 'invertido', separados por espaço
        for (int numero : invertido) {
            System.out.print(numero + " ");
          
      }


// Cria um novo array com o mesmo tamanho do array 'numeros2', para armazenar os valores em ordem invertida, usando um tamanho específico e depois inicialza cada elemento
int[] numeros2 = new int[5];
      numeros2[0] = 1;
      numeros2[1] = 2;
      numeros2[2] = 3;
      numeros2[3] = 4;
      numeros2[4] = 5;
    // Cria um novo array com o mesmo tamanho do array 'numeros', para armazenar o valores em ordem invertida
      int[] invertido2 = new int[numeros2.length];

    // Inverte os elementos do array 'numeros' e armazena no array 'invertido' 
      for (int i = 0; i < numeros2.length; i++) {
        invertido2[i] = numeros2[numeros2.length - 1 - i];
      }
      
     // Atribui o valor do array 'numeros' em ordem inversa para o array 'invertido'
      for (int numero2 : invertido2) {
          System.out.println(numero2 + " ");
      }













    }



}
