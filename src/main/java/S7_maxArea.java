public class S7_maxArea {
    public int maxArea(int[] height) {
        int ans = 0;
        int left = 0;
        int right = height.length-1;
        while(right>left ){
            int area = (right-left)*Math.min(height[left],height[right]);
            ans = Math.max(ans,area);
            if(height[left]<height[right]) {
                left++;
            }else {
                right--;
            }
        }
        return ans;
    }
}
