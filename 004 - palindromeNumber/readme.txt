Palindrome Number

Given an integer x, return true if x is a palindrome, and false otherwise.
 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.



Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. 
Therefore it is not a palindrome.



Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-2^31 <= x <= 2^(31 - 1)

-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

Solution:

package palindromeNumber;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        if(x<0 || (x!=0 && x%10==0)){
            return false;
        }
        int reverseNumber = 0;
        int dup = x;
        while(dup!=0){
            reverseNumber = reverseNumber*10 + dup%10;
            dup /=10;
        }
        if(x == reverseNumber){
            return true;
        }
        else{
            return false;
        }
    }
}

-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

Test cases:

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
