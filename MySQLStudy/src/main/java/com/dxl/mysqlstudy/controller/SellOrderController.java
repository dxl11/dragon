package com.dxl.mysqlstudy.controller;

import com.dxl.mysqlstudy.service.SellOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sell")
public class SellOrderController {

    @Autowired
    private SellOrderService sellOrderService;


    @RequestMapping("/insert")
    public void insert() {
        sellOrderService.insert();
    }
}
