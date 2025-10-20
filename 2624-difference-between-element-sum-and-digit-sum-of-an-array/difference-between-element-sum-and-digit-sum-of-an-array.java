class Solution {
    public int differenceOfSum(int[] nums) {

        int eSum = 0, dSum = 0;

        for(int i=0;i<nums.length;i++){
            eSum+=nums[i];
        }


        for(int i=0;i<nums.length;i++){
            int temp=nums[i];

            while(temp>0){
                dSum=dSum+temp%10;
                temp/=10;
            }

            
        }



        return eSum-dSum;
    }


    public void main(){
        Solution sol = new Solution();
        int[] arr = {1,15,6,3};
        int diff = sol.differenceOfSum(arr);
        System.out.println("the difference : "+ diff);
    }
}