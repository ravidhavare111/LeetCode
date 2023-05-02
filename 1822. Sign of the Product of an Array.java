class Solution {
    public int arraySign(int[] nums) {

        int NegativeNos = 0 ;
        int n = nums.length;

        for(int i = 0; i<n ; i++){
            if(nums[i] == 0){
                return 0;
            }
            if(nums[i] < 0){
                NegativeNos++;
            }
        }

        if(NegativeNos%2 == 0){
            return 1;
        }
        
        return -1;
        
        
    }
}