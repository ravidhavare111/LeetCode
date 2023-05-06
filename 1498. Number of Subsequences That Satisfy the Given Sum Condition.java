class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        int start = 0; 
        int end = n-1;
        int ans = 0;
        int M = (int)1e9+7;
        Arrays.sort(nums);

        int pows[] = new int [n];
        pows[0] = 1;

        for(int i = 1; i<n ; i++){
            pows[i] = (pows[i - 1] *2) % M ;
        }


        while(start <= end){
            if(nums[start] + nums[end] <= target){
                ans = (ans%M + pows[end-start]) % M;
                start++;
            }
            else{
                end--;
            }
        }
        return ans;
    }
}