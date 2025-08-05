package StratergyPattern;

import StratergyPattern.Stratergy.DriveStratergy;

public class Vehicle {
    private DriveStratergy driveType;

    Vehicle(DriveStratergy obj){
        this.driveType = obj;
    }

    public void drive(){
        driveType.drive();
    }
}
