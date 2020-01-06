class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>(len);
        for (int i = 0; i < len; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < len; i++) {
            int diff = target - nums[i];
            Integer index = map.get(diff);
            // 有坑，同样的元素只能用一次，所以需要判断diff的下标是否等于当前下标
            if (index != null && index != i) {
                result[0] = i;
                result[1] = index;

                break;
            }
        }

        return result;
    }
}
