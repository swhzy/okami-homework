package com.company.abstractfactory;

import com.company.FalaliCar;
import com.company.LamborghiniCar;
import com.company.factory.FalaliCarFactory;

public class FactoryCar extends AbstractFactory{

    @Override
    public FalaliCar getFllCar() {
        return (FalaliCar)new FalaliCarFactory().getCar();
    }

    @Override
    public LamborghiniCar getlbgCar() {
        return  new LamborghiniCar();
    }
}
