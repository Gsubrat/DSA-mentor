class Solution {
    public void sortColors(int[] nums) {	
         int red = 0, white = 0, blue = 0;
		for (int i : nums) {
			if (i == 0) { 
                red++;
            }
			if (i == 1) { 
                white++;
            }
			if (i == 2) { 
                blue++;
            }
		}
        int i = 0;
		while (red > 0) {	
            nums[i++] = 0;
            red--;
        }
		while (white > 0) {
            nums[i++] = 1;
            white--;
        }
		while (blue > 0) { 
            nums[i++] = 2;
            blue--;
        }
    }
}
    