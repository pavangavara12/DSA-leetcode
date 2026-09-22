class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int sum=n*(n+1)/2;
        for(int x:nums){
            sum-=x;
        }
        return sum;
    }
}