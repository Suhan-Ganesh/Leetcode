import java.util.*;

class plusOne{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(sol.plusOne(arr)));
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        digits[len-1]+=1;
        return digits;
    }
}