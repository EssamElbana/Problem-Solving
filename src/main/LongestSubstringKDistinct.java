package main;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {

    public static void main(String[] args) {
        System.out.println(findLength("cbbebi", 3));
    }

    // Time Complexity is O(2N) ----> O(N)
    public static int findLength(String str, int k) {
        int longest = 0;
        Map<Character, Integer> map = new HashMap<>();
        int windowStart = 0;
        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char character = str.charAt(windowEnd);
            // add the character to the frequency map
            map.put(character, map.getOrDefault(character, 0) + 1);
            // if map reached k distinct characters
            // start shrinking and sliding.
            while(map.size() > k) {
                char characterFromLeft = str.charAt(windowStart);
                map.put(characterFromLeft, map.get(characterFromLeft) - 1);
                if(map.get(characterFromLeft) == 0) map.remove(characterFromLeft); // new map.size() --> a place for a new distinct character.
                windowStart++;
            }
            longest = Math.max(longest, windowEnd - windowStart + 1);
        }

        return longest;
    }


    // straightforward approach
    // generate all substrings that follow the constrain
    // of having k distinct characters.
    //Time Complexity Big O(n^2)
//    public static int findLength(String str, int k) {
//        int longest = 0;
//        for(int i = 0; i < str.length(); i++) {
//            int distinct = k;
//            Set<Character> set = new HashSet<>();
//            for(int j = i; j < str.length(); j++) {
//                if (set.contains(str.charAt(j))) {
//                    longest = Math.max(longest, j - i + 1);
//                } else {
//                    if (distinct <= 0) break;
//                    set.add(str.charAt(j));
//                    distinct--;
//                }
//            }
//        }
//
//        return longest;
//    }

}
