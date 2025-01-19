package com.dxl.mg.Sss;

import java.util.ArrayList;
import java.util.List;

public class BottomAdvertisingDataReported implements AdertisingDataReported {

    public static void main(String[] args) {
        List list = new ArrayList<>();

        list.add(1);
        list.get(0);
    }

    @Override
    public AdvertisingTypeEnum advertisingType() {
        return AdvertisingTypeEnum.BOTTOM;
    }

    @Override
    public String advertisingDataReported(Object param) {
        //具体的业务
        return null;
    }
}
