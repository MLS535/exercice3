package main;

import smartDevice.SmartPhone;
import smartDevice.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Samsung",
                155.5,
                1,
                "Modelo Beta",
                25.5);
        SmartWatch smartWatch = new SmartWatch("Samsung",
                155.5,
                2, 2022);

        System.out.println(smartPhone.toString());
        System.out.println(smartWatch.toString());
    }
}
