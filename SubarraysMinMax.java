public class SubarraysMinMax {

    public static void printSubarrays(int numbers[]){
        int ts = 0;
        int ssa=0, maxSubArr=Integer.MIN_VALUE, currsum = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                for(int k=i; k<=j; k++){
                    ssa+=numbers[k];
                }
                System.out.print(ssa);
                if(maxSubArr < ssa){
                    maxSubArr=ssa;
                }
                ssa=0;
                ts++;
                System.out.println();
            }
            System.out.println("maximum subarraysum of"+ numbers[i]+" is: "+maxSubArr);
            if(currsum < maxSubArr){
                currsum=maxSubArr;
            }
            maxSubArr=0;
            System.out.println();
        }
        System.out.println("Maximum sum is"+currsum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        printSubarrays(numbers);
    }
}
