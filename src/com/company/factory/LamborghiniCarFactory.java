package com.company.factory;

import com.company.Car;
import com.company.LamborghiniCar;

public class LamborghiniCarFactory implements FactoryCar{

    @Override
    public Car getCar() {
        return new LamborghiniCar();
    }
}
