class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }else{
            return n*2;
        }
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        int num = sol.smallestEvenMultiple(5);
        System.out.println("Smallest Even Multiplt : "+num);
    }
}