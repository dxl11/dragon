package com.dragon.springsourcecodestudy.aopStudy.simpleCase;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: lydms
 * @Date: 2023/12/20
 */
public class LandlordProxy {
    public Landlord landlord;

    public LandlordProxy(Landlord landlord) {
        this.landlord = landlord;
    }

    public void apartmentToRent() {
        //出租房子之前需要做什么事
        apartmentToRentBefore();
        landlord.apartmentToRent();
        //出租房子之后我需要做什么事
        apartmentToRentAfter();
    }

    public void apartmentToRentBefore() {
        System.out.println("出租房前,收取中介费");
    }

    public void apartmentToRentAfter() {
        System.out.println("出租房后,签订合同");
    }
}
