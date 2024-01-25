
public class BinarySearch{

    public static int binarySearch(int[] arr, int e){
        return binarySearchRecursive(arr, e, 0, arr.length - 1);
    }

    private static int binarySearchRecursive(int[] arr, int e, int ini, int fim) {
        int out = -1;
        if (ini <= fim) {
            int mid = (ini + fim) / 2;

            if (arr[mid] == e) {
                out = mid;
            } else if (arr[mid] < e) {
                out = binarySearchRecursive(arr, e, mid + 1, fim);
            } else {
                out = binarySearchRecursive(arr, e, ini, mid - 1);
            }
        }
        return out;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int e = 7;

        int result = binarySearch(array, e);

        if (result == -1) {
            System.out.println("Elemento não encontrado no array.");
        } else {
            System.out.println("Elemento " + array[result] +" encontrado na posição: " + result);
        }
    }

}
