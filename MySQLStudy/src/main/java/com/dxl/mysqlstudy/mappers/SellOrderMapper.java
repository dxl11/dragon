package com.dxl.mysqlstudy.mappers;

import com.dxl.mysqlstudy.entity.SellOrder;



public interface SellOrderMapper  {

    void insert(SellOrder sellOrder);

    void insertSelective(SellOrder sellOrder);
}
