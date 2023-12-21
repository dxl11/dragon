package com.dragon.springsourcecodestudy.aopStudy.simpleCase;

public class Test {
    public static void main(String[] args) {
        Landlord landlord = new HangZhouLandlord();
        LandlordProxy landlordProxy = new LandlordProxy(landlord);
        landlordProxy.apartmentToRent();
    }
}
