package StratergyPattern;

import StratergyPattern.Stratergy.NormalDriveStratergy;
import StratergyPattern.Stratergy.SportsDriveStratergy;

public class Main {
    public static void main(String[] args) {
        SportsVehicle spr = new SportsVehicle(new NormalDriveStratergy());
        spr.drive();
    }
}
