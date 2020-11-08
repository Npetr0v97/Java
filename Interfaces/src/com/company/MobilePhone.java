package com.company;

public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered on");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Phone switched off");
        }

    }

    @Override
    public void answer() {

        if (isRinging) {

            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {

        if (phoneNumber != myNumber) {

            isRinging=true;
            System.out.println("Melody ring");
        } else {

            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}