package kidsWithTheGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> boolList = new ArrayList<Boolean>();
        int max = 0;
        for(int i = 0; i<candies.length; i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int j=0; j< candies.length; j++){
            if(candies[j]+extraCandies>=max){
                boolList.add(true);
            }else{
                boolList.add(false);
            }
        }
        return boolList;
    }
}
