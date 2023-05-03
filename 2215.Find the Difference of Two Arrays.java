class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;

        Set<Integer> S1 = new HashSet<>();
        Set<Integer> S2 = new HashSet<>();
        List<Integer> L1 = new ArrayList<>();
        List<Integer> L2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            S1.add(nums1[i]);
        }

        for (int j = 0; j < m; j++) {
            S2.add(nums2[j]);
        }

        for (int x : S1) {
            if (S2.contains(x) == false) {
                L1.add(x);
            }
        }

        for (int x : S2) {
            if (S1.contains(x) == false) {
                L2.add(x);
            }
        }

        ans.add(L1);
        ans.add(L2);
        return ans;

    }
}
