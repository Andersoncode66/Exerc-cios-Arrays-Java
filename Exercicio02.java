

public class Exercicio02 {
    public static void main(String[] args) {
       

        // Exercício resolvido Inicialização com tamanho específico
        // Esta abordagem declara o array com um tamanho específico e depois inicializa cada elemento individualmente
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        int soma = 0;

        for (int i : numeros) {
            soma += i;
        }
        System.out.println("A soma dos elementos é: " +soma);
    
    

    // Inicialização com Lista de valores e usando a classe 'Arrays' do pacote 'java.util'. A classe 'Array' of do pacote 'java.util' 
    int[] numeros2 = {1, 2, 3, 4, 55,};
    int soma2 = 0;

    for (int i : numeros2) {
        soma2 += i;

    }

    System.out.println("A soma dos elementnos é: " + soma2); 
    

   // Inicialização com Lista de valores mas usando a palavra chave- 'new'.
   int[] numeros3 = {1, 2, 3, 4, 64,};
   int soma3 = 0;
   
   for (int i : numeros3) {
       soma3 += i;
   }

   System.out.println("A soma dos elementos é: " + soma3);


}
}
