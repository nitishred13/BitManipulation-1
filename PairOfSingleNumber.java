public class PairOfSingleNumber {
    //Time Complexity: O(n)
    //Space Complexity: O(1)
// First, we XOR all numbers to get the XOR of the two unique ones.
// Then we find the lsb to separate them.
// Finally, we use lsb to get one number, and use that to get the other.
    public int[] singleNumber(int[] nums)
    {
        int bitmask1 = 0;

        for(int num:nums)
        {
            bitmask1 = bitmask1 ^ num;
        }

        int bitmask2 = 0;

        int lsb = bitmask1 & (-bitmask1);

        for(int num: nums)
        {
            if((num &lsb) != 0)
            {
                bitmask2 = bitmask2 ^ num;
            }
        }
        return new int[]{bitmask2,bitmask1^bitmask2};  
    }
}
