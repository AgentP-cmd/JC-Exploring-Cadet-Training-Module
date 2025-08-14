package org.example;

public class QuadCopter extends Drone implements VisualRecon{

    public QuadCopter(String callSign){
        super(callSign);
    }

    @Override
    public void fly(){
        System.out.println(getCallSign() + " is hovering with four rotors.");
    }
    @Override
    public void takePictures(){
        System.out.println(getCallSign() + " takes a picture with its " + SENSOR_TYPE);
    }

}
