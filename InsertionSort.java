import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class InsertionSort {
    public static void main(String[] args) {
        Integer arr[]={6,4,9,1,2,3};
        insertionSort(arr);
        //Inbuilt array sorting------------------------------------------------------
        // Arrays.sort(arr);
        // Arrays.sort(arr, 2, arr.length);
        // Arrays.sort(arr, Collections.reverseOrder());
        // Arrays.sort(arr, 0, 4, Collections.reverseOrder());
        //---------------------------------------------------------------------------
        printArray(arr);
    }

    private static void insertionSort(Integer[] arr) {
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] > temp){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = temp;
        }
        printArray(arr);
    }

    private static void printArray(Integer[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
