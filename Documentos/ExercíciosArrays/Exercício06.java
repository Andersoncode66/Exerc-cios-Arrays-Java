public class Exercício06 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int i : numeros) {
            soma += i;
        }

        double media = soma / (double) numeros.length;

        System.out.println("A média dos elementos é: " + media);




        //------------------------------------//

        int[] numeros2 = new int [5];
        numeros2[0] = 10;
        numeros2[1] = 20;
        numeros2[2] = 30;
        numeros2[3] = 40;
        numeros2[4] = 50;
        int soma2 = 0;

        for (int i : numeros2) {
            soma2 += i;

        }

        double media2 = soma2 / (double) numeros2.length;  
        System.out.println("A média dos elementos é: " + media2);




     //------------------------------------//

        int[] numeros3 = {10, 20, 30, 40, 50};
        int soma3 = 0;

        for (int i : numeros3) {
            soma3 += i;
        }

        double media3 = soma3 / (double) numeros3.length;
        System.out.println("A média dos elementos é: " + media3);





    }
}
