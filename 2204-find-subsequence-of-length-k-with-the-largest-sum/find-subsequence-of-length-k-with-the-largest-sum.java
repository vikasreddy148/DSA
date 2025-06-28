class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        int[] ans = new int[k];

        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < nums.length; ++i) {
            indices.add(i);
        }

        indices.sort((i1, i2) -> Integer.compare(nums[i2], nums[i1]));

        int[] topIndices = new int[k];
        for (int i = 0; i < k; ++i) {
            topIndices[i] = indices.get(i);
        }

        Arrays.sort(topIndices);

        for (int i = 0; i < k; ++i) {
            ans[i] = nums[topIndices[i]];
        }
        return ans;
    }
}