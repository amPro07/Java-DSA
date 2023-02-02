public class MaxSubarraySum {
    
    public static void main(String[] args) {
        int numbers[]= {-1,-2,-3,-4};
        printSubarrays(numbers);
        maxSubarrayPrefixSum(numbers);
        kadanes(numbers);
    }

    //Brut force algorith  ------------------------------------------------------------------------------------
    public static void printSubarrays(int numbers[]){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for( int i=0; i<numbers.length; i++){
            for(int j=i ; j<numbers.length; j++){
                for(int k=i; k<=j; k++){
                    curSum+=numbers[k];
                }
                System.err.println(curSum);
                if(maxSum<curSum){
                    maxSum=curSum;
                }
                curSum=0;
            }
            System.out.println();
        }
        System.out.println("maximum subarray is : "+maxSum);
    }


    //Kadanes algorithm O(n^2) ----------------------------------------------------------------------------------------
    public static void kadanes(int n[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int neg=0;

        for(int i=0; i<n.length; i++){
            if(n[i] < 0){
                neg++;
            }
        }

        if(neg != n.length){
        for(int i=0; i<n.length; i++){
            cs += n[i];
            if(cs < 0){
                cs = 0;
            }
            if(ms < cs){
                ms = cs;
            }
        }
    }else{
        ms=n[0];
    }
        System.out.println("maximum subarray sum(Kadane's) : "+ms);
    }


    //Prefix array sum way  ----------------------------------------------------------------------------
    private static void maxSubarrayPrefixSum(int[] numbers) {
        int prefix[]= new int[numbers.length];
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;

        //create an prifix array
        prefix[0]=numbers[0];
        for(int i=1; i<numbers.length; i++){
            prefix[i]= prefix[i-1]+numbers[i];
        }

        // max subarray
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max subarray(prefix array) : "+ maxSum);

    }
}
