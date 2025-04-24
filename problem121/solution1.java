class Solution {
  public int secondLargestElement(int[] nums) {

    int firstLargest = -1;
    int secondLargest = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > firstLargest) {
        secondLargest = firstLargest;
        firstLargest = nums[i];
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < firstLargest && nums[i] >= secondLrgest) {
        secondLargest = nums[i];
      }
    }
    return secondLargest;
  }
}
