class Solution {
    public int findLHS(int[] nums) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int longestHarmoniousSubsequence = 0;

        for (int num : nums) {

            if (frequencyMap.containsKey(num + 1)) {

                int currentLength = frequencyMap.get(num) + frequencyMap.get(num + 1);

                longestHarmoniousSubsequence = Math.max(longestHarmoniousSubsequence, currentLength);
            }
        }

        return longestHarmoniousSubsequence;
    }
}