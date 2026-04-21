class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsIndxMap = new HashMap<> ();
        for (int indx = 0; indx < nums.length; indx++){
            int num = nums[indx];
            int diff = target - num;

            if (numsIndxMap.containsKey(diff)){
                return new int[] {numsIndxMap.get(diff), indx};
            }
            numsIndxMap.put(num, indx);
        }
        return new int[] {};
    }
}
