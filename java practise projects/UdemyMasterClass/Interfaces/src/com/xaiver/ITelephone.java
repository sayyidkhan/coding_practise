package com.xaiver;

public interface ITelephone {

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
    // we do not need to use any access modifier in interface
    // you have to implement all the methods in an interface


}
