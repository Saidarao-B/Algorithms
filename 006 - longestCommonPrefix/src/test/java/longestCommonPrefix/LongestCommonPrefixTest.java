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
