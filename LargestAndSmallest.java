public class LargestAndSmallest {

    public static int getlargestNSmallest(int numbers[]){
        int largest = Integer.MIN_VALUE;// -infinity
        int smallest = Integer.MAX_VALUE;// +infinity

        for( int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest is: "+smallest);
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {4, 34, 9 , 67, 4, 745};
        System.out.println("largest is : "+ getlargestNSmallest(numbers));
    }
}
