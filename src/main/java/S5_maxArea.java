import java.io.ByteArrayOutputStream;

public class S5_maxArea {
    public int maxArea(int[] height) {
        int result = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            result = Math.max(area, result);
            if (height[left] < height[right]) {
                left++;
            } else {
                right++;
            }
        }
        return result;
    }
}
