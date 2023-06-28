package com.max.spring.inversion_of_control;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Another Life";
    }
}
