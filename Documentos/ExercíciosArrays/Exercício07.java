public class Exercício07 {
    public static void main(String[] args) {
        int[] numeros = {3, 6, 9, 12, 15, 18};
        int contador = 0;
        
        for (int i : numeros) {
            if (i % 2 == 0) {
                contador++;
            }
        }

        System.out.println("A quantida elementos pares é: " + contador);
    



    //--------------------------//
    
    int[] numeros2 = new int[5];
    numeros2[0] = 3;
    numeros2[1] = 6;
    numeros2[2] = 9;
    numeros2[3] = 12;
    numeros2[4] = 18;

    for (int i : numeros2) {
        if (i % 2 == 0) {
            contador++;
        }
    }

    //-----------------------------------------//
    int[] numeros3 = new int[]{1, 2, 3, 4, 5};
    for (int i : numeros3) {
        if (i % 2 == 0) {
            contador++;
        }
    }

    System.out.println("A quantidade de elementos pares é" + contador);


    
}
}