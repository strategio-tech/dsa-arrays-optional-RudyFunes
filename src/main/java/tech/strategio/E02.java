package tech.strategio;

import java.lang.reflect.Array;
import java.util.Arrays;

public class E02 {
    /**
     * Given two strings, see if they're anagrams. See README.md.
     *
     * @param s - string #1
     * @param t - string #2
     * @return A true/false value if they're anagrams of each other
     */
    public boolean isAnagram(String s, String t) {
        // @TODO Write out the method
        String sortedStringS ="";
        String sortedStringT = "";


        if (s.length() == t.length()){  // to proceed checking if both strings are anagrams compare length
            char[] arrS = s.toCharArray();  // turn both strings to char arrays
            char[] arrT = t.toCharArray();

            Arrays.sort(arrS);  // sort the 2 char arrays
            Arrays.sort(arrT);

            for (int i = 0; i < arrS.length; i++){
                sortedStringS += arrS[i]; // put back the sorted array to a string
                sortedStringT += arrT[i];

            }

            if (sortedStringS.equals(sortedStringT)){
                return true;
            }
        }
        return false;
    }
}
