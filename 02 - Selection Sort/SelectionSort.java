public class SelectionSort{

    public static void selectionSort(int[] arr) {
        selectionSortRecursive(arr, 0); // Inicia a ordenação recursiva a partir do índice 0
    }

    private static void selectionSortRecursive(int[] arr, int startIndex) {
        if (startIndex >= arr.length - 1) {
            return; // Retorna se o índice inicial for maior ou igual ao último índice do array
        }

        int minIndex = startIndex;
        // Encontra o índice do menor elemento na parte não ordenada do array
        for (int i = startIndex + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        // Troca o menor elemento encontrado com o primeiro elemento da parte não ordenada(swap)
        int temp = arr[startIndex];
        arr[startIndex] = arr[minIndex];
        arr[minIndex] = temp;
        selectionSortRecursive(arr, startIndex + 1); //chamada recursiva
    }
    public static void main(String[] args) {
        int[] arr = {7, 4, 2, 8, 1};
        
        System.out.println("Array antes da ordenação:");
        imprimirArray(arr);

        selectionSort(arr);

        System.out.println("Array depois da ordenação:");
        imprimirArray(arr);
    }

    private static void imprimirArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}