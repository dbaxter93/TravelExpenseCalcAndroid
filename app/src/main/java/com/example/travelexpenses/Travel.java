package com.example.travelexpenses;

public class Travel {

    Double trip;

    void CalcTrip(double mtod, double mpg, double gas)
    {
        trip=(mtod/mpg)*gas;
    }

    double getTrip()
    {
        return trip;
    }

}
