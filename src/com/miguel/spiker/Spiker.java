package com.miguel.spiker;

import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class Spiker {

    public static void main(String[] args) {
        LCD.drawString("Spiker", 0, 0);

        EV3LargeRegulatedMotor motorA = new EV3LargeRegulatedMotor(MotorPort.A);

        motorA.setSpeed(1000);
        motorA.rotate(-1800);


        motorA.close();

    }

}
