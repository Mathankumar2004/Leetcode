class Solution {
    public int thirdMax(int[] nums) {
       LinkedHashSet<Integer> res = new LinkedHashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            res.add(nums[i]);
        }
        List<Integer> arr = new ArrayList<>(res);
        int len=arr.size();
        if (len<=2) {
            return(arr.get(len-1));
        } else {
            return(arr.get(len-3));
        }
    }
}
