package com.day13.Problem2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Problem2 {
    public static void main(String[] args) {
        Function<ArrayList<Integer>, Integer> fun_a = list -> {
            Integer sum = 0;
            for (Integer integer : list)
                sum += integer;
            return sum / list.size();
        };
        Function<Map<String, Integer>, ArrayList<Integer>> fun_b = list -> {
            ArrayList<Integer> values = new ArrayList<>();
            for (Integer integer : list.values())
                values.add(integer);
            return values;
        };
        Map<String, Integer> map = new HashMap<>();
        map.put("岑小村", 59);
        map.put("谷天洛", 82);
        map.put("渣渣辉", 98);
        map.put("蓝小月", 65);
        map.put("皮几万", 70);
        System.out.println(fun_a.apply(fun_b.apply(map)));
    }
}
