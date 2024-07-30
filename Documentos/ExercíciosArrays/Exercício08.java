public class Exercício08 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        int[] mesclado = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, mesclado, 0, array1.length);
        System.arraycopy(array2, 0, mesclado, array1.length, array2.length);
        

        for (int i : mesclado) {
            System.err.println(i +"");
        }


    }
}
