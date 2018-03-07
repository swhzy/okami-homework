package com.company.aa;

public class Factory {

    public static Object getObject(String name){
        try {
            Class<?> aClass = Class.forName(name);
            return aClass.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
