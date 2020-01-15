package com.day10.Problem2;

public interface A{
    public abstract void showA();
    public default void showB() {
        System.out.println("BBBB");
    }
}
