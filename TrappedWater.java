public class TrappedWater {
    public static void main(String[] args) {
        int height[]= {8, 2, 9, 7 };
        trappedWater(height);
    }

    private static void trappedWater(int[] height) {
        //left maximum boundary
        int leftMax[] = new int[height.length];
        leftMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0 ;i--){
            leftMax[i]= Math.max(leftMax[i+1], height[i]);
        }

        //right maximum boundary
        int rightmax[] = new int[height.length];
        rightmax[0]=height[0];
        for(int i=1; i<height.length; i++){
            rightmax[i]= Math.max(rightmax[i-1], height[i]);
        }

        int trappedWater = 0;
        for(int i=0; i<height.length; i++){
             //Water level = min(left maximum boundary, right maximum boundary)
            int waterLevel = Math.min(leftMax[i], rightmax[i]);
             //trapped water = water level - height
            trappedWater += waterLevel - height[i];
        }
       System.out.println(trappedWater);
       
    }
}
