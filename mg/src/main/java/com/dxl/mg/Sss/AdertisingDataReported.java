package com.dxl.mg.Sss;

/**
 * 定义一个上报的接口
 */
public interface AdertisingDataReported {

    //新增方法
    AdvertisingTypeEnum advertisingType();

    String advertisingDataReported(Object param);
}
