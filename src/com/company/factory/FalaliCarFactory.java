package com.company.factory;

import com.company.Car;
import com.company.FalaliCar;

public class FalaliCarFactory implements FactoryCar{

    @Override
    public Car getCar() {
        return new FalaliCar();
    }
}
