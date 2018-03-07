package com.company;

import com.company.aa.Factory;
import com.company.factory.FactoryCar;
import com.company.factory.FalaliCarFactory;
import com.company.factory.LamborghiniCarFactory;

public class Main {

    public static void main(String[] args) {
        //  各自工厂生产各自的东西
        FalaliCarFactory falaliCarFactory = new FalaliCarFactory();
        FalaliCar car = (FalaliCar)falaliCarFactory.getCar();

        LamborghiniCarFactory lamborghiniCarFactory = new LamborghiniCarFactory();
        LamborghiniCar car1 = (LamborghiniCar) lamborghiniCarFactory.getCar();

        //  一个工厂可以生产好多品牌的东西  当要
        com.company.abstractfactory.FactoryCar factoryCar = new com.company.abstractfactory.FactoryCar();
        System.out.println(factoryCar.getFllCar());

        LamborghiniCar object = (LamborghiniCar) Factory.getObject(LamborghiniCar.class.getName());
        System.out.println(object);

    }
}
