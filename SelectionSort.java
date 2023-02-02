//select/pick the smallest number and push towards start
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selctionSort(arr);
        printArr(arr);
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    private static void selctionSort(int[] arr) {
        for(int i=0 ; i<arr.length-1; i++){//arr[0]=5
            int minPos=i;//i=0
            for(int j=i+1; j<arr.length; j++){//i=0 to 4
                if(arr[minPos] > arr[j]){//j=1 
                    minPos=j;
                }
            }
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
}
