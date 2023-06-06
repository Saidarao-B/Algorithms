Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"


Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""


Explanation: There is no common prefix among the input strings.
 

Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.


-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

Solution:

package longestCommonPrefix;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< Math.min(strs[0].length(), strs[strs.length -1].length()); i++){
            if(strs[0].charAt(i) == strs[strs.length -1].charAt(i)){
                sb.append(strs[0].charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();        
    }
}


-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

Test cases:

package longestCommonPrefix;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestCommonPrefixTest {

	LongestCommonPrefix prefix = new LongestCommonPrefix();
	
	@Test
	public void test1() {
		assertEquals("", prefix.longestCommonPrefix(new String[] {"dog","racecar","car"}));
	}

	@Test
	public void test2() {
		assertEquals("fl", prefix.longestCommonPrefix(new String[] {"flower","flow","flight"}));
	}
	
	@Test
	public void test3() {
		assertEquals("k", prefix.longestCommonPrefix(new String[] {"king", "kohli", "kong"}));
	}
	
	@Test
	public void test4() {
		assertEquals("gl", prefix.longestCommonPrefix(new String[] {"glow", "glass", "glare"}));
	}
	
	
	@Test
	public void test5() {
		assertEquals("flo", prefix.longestCommonPrefix(new String[] {"flow", "flower", "float"}));
	}
}

											*-*-*-*-*-*-*
-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-|  Thank you  |-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
											*-*-*-*-*-*-*