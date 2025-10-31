class Solution {
//Time Complexity:O(n)
//Space Complexity:O(n)
// We're using rolling hash to convert DNA substrings into hash value for fast comparison.
// For each new character, we update the hash and drop the oldest one if needed.
// If we’ve seen the hash before, we add the corresponding substring to the result.
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        HashSet<String> allSeq = new HashSet<>();
        HashSet<String> result = new HashSet<>();

        for(int i=0;i<n-9;i++)
        {
            String substr = s.substring(i,i+10);
            if(allSeq.contains(substr))
            {
                result.add(substr);
            }
            else
            {
                allSeq.add(substr);
            }
        }
        return new ArrayList<>(result);
    }
}