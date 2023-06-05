package romanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public int romanToInt(String s) {
        Map<Character, Integer> romanIntMap = new HashMap<Character, Integer>();
        romanIntMap.put('I',1);
        romanIntMap.put('V',5);
        romanIntMap.put('X',10);
        romanIntMap.put('L',50);
        romanIntMap.put('C',100);
        romanIntMap.put('D',500);
        romanIntMap.put('M',1000);
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            if(i>0 && romanIntMap.get(s.charAt(i))>romanIntMap.get(s.charAt(i-1))){
                sum+=romanIntMap.get(s.charAt(i)) - 2*romanIntMap.get(s.charAt(i-1));
            }
            else{
                sum+=romanIntMap.get(s.charAt(i));
            }
        }
        return sum;
    }
}
