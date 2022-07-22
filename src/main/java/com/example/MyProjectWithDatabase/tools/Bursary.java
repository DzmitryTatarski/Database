package com.example.MyProjectWithDatabase.tools;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Bursary {

    private static final Map<Integer, Integer> bursariesMap = Map.of(10, 5000, 8, 4000, 6, 3000);

    public static int setBursary(int averageMark){
        if (averageMark < 6)
            return 0;
        return bursariesMap.get(averageMark / 2 * 2);
    }
}
