public class SingleNum {
    //Time Complexity: O(n)
    //Space Complexity: O(1)
// we XOR all numbers to get the unique number as XOR removes the duplicate numbers.   
    public int singleNumber(int[] nums){
        int result = 0;
        for(int num:nums)
        {
            result = result^num;
        }
        return result;
    }
}
 