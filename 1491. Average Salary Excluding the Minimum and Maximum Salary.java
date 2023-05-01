class Solution {
    public double average(int[] salary) {
        int n = salary.length;
       Arrays.sort(salary);
       double ans = 0;
       double count = 0;

       for(int i = 1; i< n-1 ; i++){
           ans+=salary[i];
           count++;
       }

       return ans/count;
    }
}