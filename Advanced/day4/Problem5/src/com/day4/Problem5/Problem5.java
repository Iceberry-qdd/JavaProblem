package com.day4.Problem5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Problem5 {
    public static void main(String[] args){
        Map<Car,String> map=new HashMap<>();
        Car car1=new Car(1,220316);
        Car car2=new Car(2,362016);
        Car car3=new Car(3,429600);
        Car car4=new Car(4,253695);
        Car car5=new Car(5,336953);
        map.put(car1, String.valueOf(car1.getPrice()));
        map.put(car2, String.valueOf(car2.getPrice()));
        map.put(car3, String.valueOf(car3.getPrice()));
        map.put(car4, String.valueOf(car4.getPrice()));
        map.put(car5, String.valueOf(car5.getPrice()));
        System.out.println("keySet方式遍历：");
        Set<Car> keySet=map.keySet();
        for(Car key:keySet){
            String value=map.get(key);
            System.out.println(key+"-"+value);
        }
        System.out.println("entrySet方式遍历：");
        Set<Map.Entry<Car,String>> entrySet=map.entrySet();
        for(Map.Entry<Car,String> entry:entrySet)
            System.out.println(entry.getKey()+"-"+entry.getValue());
    }
}
