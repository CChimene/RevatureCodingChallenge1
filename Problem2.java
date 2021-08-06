public class Problem2 {
		public int[] findMinMax(int[] nums){
			int[] minMax = new int[2];
			Arrays.sort(nums);
			
			minMax[0] = nums[0];
			minMax[1] = nums[nums.length-1]
			
			return minMax;
		}
		
		public findMissing(int[] nums) {
			Arrays.sort(nums);
			
			for(int i = 1; i<nums.length; i++) {
				if(nums[i] - nums[i-1] > 1) {
					return nums[i] - 1;
				}
			}
			
			return -1;
		}
}