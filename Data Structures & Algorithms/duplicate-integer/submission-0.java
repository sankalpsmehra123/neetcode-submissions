class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        
        for (int index = 0; index < nums.length; index++) {
            if (numsSet.contains(nums[index])) {
                return true;  // Found duplicate immediately
            }
            numsSet.add(nums[index]);
        }
        
        return false;  // No duplicates found
    }
}