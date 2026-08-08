public class trappedRain {
    public static int trappedRainWater(int height[]) {
        int n = height.length;
        // Left Max Array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // Right Max Array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // loop
        int trappedWater = 0;
        for(int i=0; i<n; i++) {
            // waterLevel
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water formula
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]) {
        int heights[] = {2,-3,4,-5,6,0,5};
        int res = trappedRainWater(heights);
        System.out.println("Trapped Rain Water value is : " +res);
    }
}
