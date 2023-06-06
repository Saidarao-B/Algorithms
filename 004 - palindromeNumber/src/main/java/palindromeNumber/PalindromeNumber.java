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
