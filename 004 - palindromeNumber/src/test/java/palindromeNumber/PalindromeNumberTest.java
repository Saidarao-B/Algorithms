package palindromeNumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeNumberTest {
	PalindromeNumber palindrome = new PalindromeNumber();
	

	@Test
	public void test1() {
		assertFalse(palindrome.isPalindrome(-121));
	}

	@Test
	public void test2() {
		assertFalse(palindrome.isPalindrome(1210));
	}
	
	@Test
	public void test3() {
		assertTrue(palindrome.isPalindrome(121));
	}
	
	@Test
	public void test4() {
		assertTrue(palindrome.isPalindrome(12321));
	}
	
	@Test
	public void test5() {
		assertTrue(palindrome.isPalindrome(1598951));
	}
	
	@Test
	public void test6() {
		assertFalse(palindrome.isPalindrome(152451));
	}
}
