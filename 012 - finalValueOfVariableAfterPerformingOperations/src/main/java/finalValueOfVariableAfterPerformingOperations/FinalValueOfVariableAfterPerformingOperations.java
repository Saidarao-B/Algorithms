package finalValueOfVariableAfterPerformingOperations;

public class FinalValueOfVariableAfterPerformingOperations {

    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        if(operations.length == 0){
            return 0;
        }
        for(String str : operations){
            if(str.contains("+")){
                X += 1;
            }else{
                X -= 1;
            }
        }
        System.gc();
        return X;        
    }	
}
