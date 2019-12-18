package leet;

public class code35 {
	public static void main(String[] args) {
		code35 code = new code35();
		System.out.print(code.searchInsert(nums, target));
	}
	static int[] nums= {1,2,3,4,5,6,7,8};
	static int target= 6;
	public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
        	if (nums[i]>=target) {
				return i;
			}
        }
        return nums.length;
    }
}
