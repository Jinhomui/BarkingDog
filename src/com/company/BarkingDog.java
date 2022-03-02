package com.company;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == false) {
            System.out.println("dog is not barking");
            return false;
        }
        if (hourOfDay < 0 || hourOfDay > 24) {
            System.out.println("Invalid hours");
            return false;
        } else if (barking == true && hourOfDay < 8 || hourOfDay > 22) {
            System.out.println("dog is barking");
            return true;
        }
        System.out.println("It's between 8am to 10pm.");
        return false;
    }
}
