package Exc1_100.Exc1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    public int[] twoSum(int[] numbers, int target) {


        Map<Integer, Integer> indexMap = new HashMap<>();


        for (int i = 0; i < numbers.length; i++) {


            Integer requiredNum = target - numbers[i];

            if (indexMap.containsKey(requiredNum)) {
                return new int[] {indexMap.get(requiredNum), i};
            }

            indexMap.put(numbers[i], i);
        }
        return new int[] {-1, -1};
    }
}
