class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap<Integer, Integer>();
        int result=0;
        for (int i = 0; i < nums.length; i++) {
            if (res.containsKey(nums[i])) {
                int value = res.get(nums[i]);
                res.put(nums[i], value + 1);
            } else {
                res.put(nums[i], 1);
            }
        }
        for (int i : res.keySet()) {
            if (res.get(i) == 1) {
                result = i;
                break;
            }
        }
        System.out.println(res);
        return result;
    }
}
