class Water {
  public int maxArea(int[] height) {
    int ans = 0;
    int l = 0;
    int r = height.length - 1;

    while (l < r) {
      final int minHeight = Math.min(height[l], height[r]);
      ans = Math.max(ans, minHeight * (r - l));
      if (height[l] < height[r])
        ++l;
      else
        --r;
    }

    return ans;
  }

  public static void main(String[] args) {
    mostWater sc = new mostWater();
    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7}; 
    int result = sc.maxArea(height);
    System.out.println("Maximum area: " + result);
  }
}
