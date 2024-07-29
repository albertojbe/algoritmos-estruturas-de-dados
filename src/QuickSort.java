public class QuickSort {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] numeros = {1, 5, 4, 7, 8 ,9};
        quickSort(numeros);
    }

    public static void quickSort(int[] lista){
        int pivo = lista[0];
        int rPointer = 0;
        int lPointer = lista.length - 1;

        while (lPointer <= rPointer){
            while (lista[lPointer] < pivo){
                lPointer += 1;
            }
            while (lista[rPointer] >= pivo){
                rPointer -= 1;
            }
            wrapper(rPointer, lPointer);
        }
        
    }
    public static void wrapper(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }
}
