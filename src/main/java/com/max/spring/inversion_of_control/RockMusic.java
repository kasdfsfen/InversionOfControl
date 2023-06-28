package com.max.spring.inversion_of_control;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Another Life";
    }
}
