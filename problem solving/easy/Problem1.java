You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

Example 1:
Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

   public int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int count = words.length;
        for(int i = 0; i < allowed.length(); i++){
            mp.put(allowed.charAt(i), 1);
        }
            for(int i =0; i< words.length; i++){
               for (int j = 0; j<words[i].length(); j++){
                   if (mp.get(words[i].charAt(j)) == null){
                       count -- ;
                       break;
                   }
               }
        }
        return count;
    }