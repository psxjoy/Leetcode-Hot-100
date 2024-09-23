public class S8_trap {

    public int trap1(int[] height) {
        int n = height.length;
        int[] preMax = new int[n];
        int[] surfMax = new int[n];
        preMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            preMax[i] = Math.max(height[i], preMax[i - 1]);
        }
        surfMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            surfMax[i] = Math.max(height[i], surfMax[i + 1]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(preMax[i], surfMax[i]) - height[i];

        }
        return ans;
    }

    public int trap2(int[] height) {

    }
}
