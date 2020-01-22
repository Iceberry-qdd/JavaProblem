package com.day4.Problem5;

import java.util.Objects;
public class Car{
    private int num;
    private double price;
    public Car(){}
    public Car(int num,double price){
        this.num=num;
        this.price=price;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car car = (Car) o;
        return num == car.num &&
                Double.compare(car.price, price) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(num, price);
    }
    @Override
    public String toString() {
        return "num" + num ;
    }
}
