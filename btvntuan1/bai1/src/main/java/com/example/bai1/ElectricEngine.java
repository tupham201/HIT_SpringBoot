package com.example.bai1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class ElectricEngine implements Engine {

    @Override
    public void start() {

    }
}
