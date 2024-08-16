class Solution {
    public String reorganizeString(String s) {
       
        int[] charCount = new int[26];
        int maxCount = 0; 
      
       
        for (char character : s.toCharArray()) {
            int index = character - 'a';
            charCount[index]++;
            
            maxCount = Math.max(maxCount, charCount[index]);
        }
      
        int length = s.length();
        
        if (maxCount > (length + 1) / 2) {
            return "";
        }
      
        int distinctChars = 0;
        
        for (int count : charCount) {
            if (count > 0) {
                distinctChars++;
            }
        }
      
       
        int[][] charFrequency = new int[distinctChars][2];
        distinctChars = 0;
        for (int i = 0; i < 26; ++i) {
            if (charCount[i] > 0) {
                charFrequency[distinctChars++] = new int[] {charCount[i], i};
            }
        }
      
        Arrays.sort(charFrequency, (a, b) -> b[0] - a[0]);
      
        
        StringBuilder result = new StringBuilder(s);
        int idx = 0; 
      
       
        for (int[] entry : charFrequency) {
            int freq = entry[0], charIndex = entry[1];
            while (freq-- > 0) {
                result.setCharAt(idx, (char) ('a' + charIndex));
                idx += 2;
                // Wrap around if index goes beyond string length.
                if (idx >= length) {
                    idx = 1;
                }
            }
        }
      
        return result.toString();
    }
}