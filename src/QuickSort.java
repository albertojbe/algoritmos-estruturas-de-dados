public class QuickSort {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] numeros = {4, 5, 1, 3, 7};
        for (int numero:numeros){
            System.out.println(numero);
        }
        quickSort(numeros, 0, numeros.length-1);
        System.out.printf("%d %d %d %d \n", numeros[0], numeros[1], numeros[2], numeros[3]);
    }

    public static void quickSort(int[] lista, int startPoint, int endPoint){
        int pivo = lista[startPoint];
        int rPointer = endPoint;
        int lPointer = startPoint;

        while (lPointer <= rPointer){
            while (lista[lPointer] < pivo){
                lPointer ++;
            }
            while (lista[rPointer] >= pivo){
                rPointer --;
            }
            if (lPointer <= rPointer) {
                int temp = lista[lPointer];
                lista[lPointer] = lista[rPointer];
                lista[rPointer] = temp;
                lPointer ++;
                rPointer --;
            }
                
        }

        if (rPointer > startPoint){
            quickSort(lista, startPoint, rPointer);
        }

        if (lPointer < lista.length - 1){
            quickSort(lista, lPointer + 1, lista.length - 1);
        }
    }

    public static void wrapper(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }
}
