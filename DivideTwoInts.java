class Solution{
    //Time Complexity: O(log(dividend))
    // Space Complexity: O(1)
// First convert both numbers to positive and handle overflow case upfront.
// Use bit shifts to subtract the largest possible multiple of divisor each time.
// Keep accumulating the count of shifts to get the final quotient.
    public int divide(int dividend, int divisor)
    {
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if(divisor == 1) return dividend;

        int result = 0;

        long ldividend = Math.abs(Long.valueOf(dividend));
        long ldivisor = Math.abs(Long.valueOf(ldividend));

        while(ldividend >= ldivisor)
        {
            int numShifts = 1;
            while((ldivisor<<numShifts) <= ldividend)
            {
                numShifts++;
            }
            numShifts--;

            result += 1 << numShifts;
            ldividend = ldividend - (ldivisor << numShifts);
        }

        if(dividend > 1 && divisor > 1) return result;
        if(dividend< 1 && divisor < 1) return result;
        return -result;
    }
}